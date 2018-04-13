package wen.jia.hao.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author wenjia.hao
 * @version 1.0
 * @Since 2016/7/28.
 */
@Component
public class Sale implements Serializable {
    private static final long serialVersionUID = 5660461405408577948L;
    public Sale(){
        System.err.println("初始化构造");
    }
    @Setter
    @Getter
    private Integer id;
    @Setter
    @Getter
    private String name="循环依赖";
    @Setter
    @Getter
    private Integer saleCount;


    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", saleCount=" + saleCount +
                '}';
    }
}
