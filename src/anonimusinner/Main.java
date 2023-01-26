package anonimusinner;

public class Main {
    public static void main (String[] args){
        MonitoringSystem generalIndicatorMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал!");
            }
        };
        MonitoringSystem errorMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживание ошибок стартовал!");
            }
        };
        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };
        generalIndicatorMonitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityModule.startMonitoring();
    }
    }
