import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.StringWriter;

public class javaworksheet {
    public static void main(String[] args) throws JAXBException
    {
        // Create an object to be serialized into XML
        Cat cat = new Cat();
        cat.name = "Missy";
        cat.age = 5;
        cat.weight = 4;

        // Write the result of the serialization to a StringWriter
        StringWriter writer = new StringWriter();

        // Create a Marshaller object that will perform the serialization
        JAXBContext context = JAXBContext.newInstance(Cat.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // And here's the serialization itself:
        marshaller.marshal(cat, writer);

        // Convert everything written to the StringWriter
        String result = writer.toString();
        System.out.println(result);
    }

    @XmlType(name = "cat")
    @XmlRootElement
    static class Cat
    {
        public String name;
        public int age;
        public int weight;

        Cat()
        {
        }
    }
}
