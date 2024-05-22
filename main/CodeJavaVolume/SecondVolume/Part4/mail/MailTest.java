package CodeJavaVolume.SecondVolume.Part4.mail;


import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class MailTest {
    public static void main(String[] args) throws IOException, MessagingException {
        var props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get("CodeJavaVolume", "SecondVolume", "Part4", "mail", "mail.properties"))) {
            props.put("mail.smtp.starttls.enable", "true");
            props.load(in);

        }
        if (args.length > 0) {
            List<String> lines = Files.readAllLines(Paths.get(args[0]), StandardCharsets.UTF_8);
            String from = lines.get(0);
            String to = lines.get(1);
            String subject = lines.get(2);

            var builder = new StringBuilder();
            for (int i = 3; i < lines.size(); i++) {
                builder.append(lines.get(i));
                builder.append("\n");
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入密码：");
            String password = scanner.nextLine();
            Session mailSession = Session.getDefaultInstance(props);
            mailSession.setDebug(true);
            var message = new MimeMessage(mailSession);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(builder.toString());
            Transport tr = mailSession.getTransport();
            try {

                tr.connect(from, password);
                tr.sendMessage(message, message.getAllRecipients());
            } finally {
                tr.close();
            }
        }


    }
}
