package com.veselov.alex;

import java.util.Date;

public class App {
    public static void main(String[] args) throws InterruptedException {
        checkLazyInitializationService();

        checkSecurityProxy();

        checkCacheProxy();
    }

    static void checkCacheProxy() throws InterruptedException {
        CachedService dbService = new CachedService();
        DBService service = new CacheProxy(dbService);
//        Real execution
        service.execute();
//        From Cache
        service.execute();
        service.execute();
        service.execute();

        Thread.sleep(2_000);
        dbService.setData("New data");
//        Real execution
        service.execute();
//        From Cache
        service.execute();
        service.execute();
        service.execute();
    }

    static void checkSecurityProxy() {
        Service service = new SecurityProxy(new LimitAccessService());
        service.execute();

        ((SecurityProxy) service).setFlag(true);
        service.execute();
    }

    static void checkLazyInitializationService() throws InterruptedException {
        Service service = new LazyInitializationProxy();
        System.out.println("Create lazyInitializationProxy: " + new Date());

        Thread.sleep(10_000);
        System.out.println("Run service after some time...");
        service.execute();
        service.execute();
        service.execute();
    }
}
