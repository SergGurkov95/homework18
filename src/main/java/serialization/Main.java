package serialization;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user;

        for (; ; ) {
            String input = read();
            if (!input.contains(" ")) {
                System.out.println("неверный ввод");
            } else if (input.substring(0, input.indexOf(' ')).equals("create")) {
                user = createUser(input);
                serialize(user);
            } else if (input.substring(0, input.indexOf(' ')).equals("show")) {
                String name = getFileName(input);
                File file = new File("src/main/resources/" + name.replace(" ", "_").toUpperCase() + ".dat");
                deserialize(file, name);
            } else {
                System.out.println("неверный ввод");
            }
        }

    }

    private static String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    private static void serialize(User user) {
        File file = new File("src/main/resources/" + user.getName().replace(" ", "_").toUpperCase() + ".dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static User createUser(String string) {
        String name = string.substring(string.indexOf('=') + 2, string.indexOf(',') - 1);
        string = string.substring(string.indexOf(',') + 1);
        String email = string.substring(string.indexOf('=') + 2, string.indexOf(',') - 1);
        string = string.substring(string.indexOf(',') + 1);
        String phone = string.substring(string.indexOf('=') + 2, string.length() - 1);

        return new User(name, email, phone);

    }

    private static String getFileName(String string) {
        String name = string.substring(string.indexOf(' ') + 2, string.length() - 1);
        return name;
    }

    private static void deserialize(File file, String name) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            User user = (User) ois.readObject();
            System.out.println(user.toString());
        } catch (FileNotFoundException e) {
            System.out.println("User \"" + name + "\" not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
