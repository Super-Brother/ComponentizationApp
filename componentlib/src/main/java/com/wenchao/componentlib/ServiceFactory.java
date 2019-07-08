package com.wenchao.componentlib;

/**
 * @author wenchao
 * @date 2019/7/8.
 * @time 13:29
 * description：
 */
public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    private ILoginService iLoginService;
    private IMineService iMineService;

    public ILoginService getILoginService() {
        return iLoginService;
    }

    public void setILoginService(ILoginService iLoginService) {
        this.iLoginService = iLoginService;
    }

    public IMineService getMineService() {
        return iMineService;
    }

    public void setMineService(IMineService iMineService) {
        this.iMineService = iMineService;
    }
}
