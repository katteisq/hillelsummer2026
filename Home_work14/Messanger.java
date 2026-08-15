public class Messanger implements Printer {
    static void main(String[] args) {
        Messanger printer = new Messanger();

        Message message1 = new Message(null, null);
        System.out.println("Test nr. 1");
        printer.print(message1);

        Message message2 = new Message("Hi!", null);
        System.out.println("Test nr. 2");
        printer.print(message2);

        Message message3 = new Message("Hi!", "John");
        System.out.println("Test nr. 3");
        printer.print(message3);
    }

        public static class Message {
            private String text;
            private String sender;

            // Konstruktor
            public Message(String text, String sender) { // bez void bo to konstruktor a także taka sama nazwa jak i class
                this.text = text;
                this.sender = sender;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) { // w setterach nie uzywamy typu zmiennej, nie piszemy np. int lub String
                this.text = text;
            }

            public String getSender() {
                return sender;
            }

            public void setSender(String sender) {
                this.sender = sender;
            }
        }
        @Override
        public void print (Message message){
            // wprowadzamy do metodu znaczenia text i sender

            //tworzymy anonimowy class w środku tego

            if ((message.getText() == null || message.getText().isEmpty()) && (message.getSender() == null || message.getSender().isEmpty())) {

                Printer anonymousPrinter = new Printer() { //
                    @Override
                    public void print(Message message) {
                        System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                    }
                }; // zakończenie zmiennej

                anonymousPrinter.print(message);
                // powyżej zrobiliśmy tylko konstrukcję tego classu tutaj musimy jeszcze wywołać resultat

            } else if (message.getSender() == null || message.getSender().isEmpty()) { // tylko w taki sposób sprawdzimy czy jest pusta nie możemy użyć (... == "")
                System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
            } else {
                System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
            }
        }
    }

