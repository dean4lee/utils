package cn.inslee.utils;

import cn.inslee.utils.exception.BeanException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlUtils {

    /**
     * xml转换成bean，只支持JAXB
     *
     * @param xml
     * @param beanClass
     * @param <T>
     * @return
     */
    public static <T> T xml2Bean(String xml, Class<T> beanClass) {
        Assert.notNull(xml, "xml String can be not null");
        Assert.notNull(beanClass, "bean class can be not null");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(beanClass);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(xml);
            Object bean = unmarshaller.unmarshal(reader);
            return (T) bean;
        } catch (Throwable e) {
            throw new BeanException(e);
        }
    }

    /**
     * bean转xml，只支持JAXB
     *
     * @param bean
     * @return
     */
    public static String bean2Xml(Object bean) {
        Assert.notNull(bean, "bean can be not null");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(bean.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter writer = new StringWriter();
            marshaller.marshal(bean, writer);
            return writer.toString();
        } catch (Throwable e) {
            throw new BeanException(e);
        }
    }
}