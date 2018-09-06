package com.dubbo.provider.service.impl;

import com.dubbo.provider.service.DubboServiceProvider;
import org.springframework.stereotype.Component;

/**
 * @author leidian560
 * @date 2018-09-06 14:03
 */
@Component("dubboServiceProvider")
public class DubboServiceProviderImpl implements DubboServiceProvider {
    /**
     * @return
     * @throws
     * @author leidian560
     * @date 2018-09-06 14:34
     * @params
     * @since
     */
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
