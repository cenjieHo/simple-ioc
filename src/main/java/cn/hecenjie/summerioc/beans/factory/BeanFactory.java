package cn.hecenjie.summerioc.beans.factory;

/**
 * @author cenjieHo
 * @since 2019/4/25
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
