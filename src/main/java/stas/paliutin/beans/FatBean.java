package stas.paliutin.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.Optional;

@Component
public class FatBean {

    @Autowired
    private FirstComponent firstComponent;

    @Autowired(required = false)
    private InnerBean innerBean;

    @Autowired
    private Optional<InnerBean> optionalInnerBean;

    @Inject
    private FirstService firstService;

//    @Autowired
    @Inject
    @Nullable
    private InnerBean injectInnerBean;

    @Inject
    private Optional<InnerBean> optionalInjectInnerBean;

    public FirstComponent getFirstComponent() {
        return firstComponent;
    }

    public InnerBean getInnerBean() {
        return innerBean;
    }

    public Optional<InnerBean> getOptionalInnerBean() {
        return optionalInnerBean;
    }

    public FirstService getFirstService() {
        return firstService;
    }

    @Nullable
    public InnerBean getInjectInnerBean() {
        return injectInnerBean;
    }

    public Optional<InnerBean> getOptionalInjectInnerBean() {
        return optionalInjectInnerBean;
    }
}
