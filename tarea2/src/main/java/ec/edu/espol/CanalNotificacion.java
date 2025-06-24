package src.main.java.ec.edu.espol;

public interface CanalNotificacion {
    void notifBoletoNoDisp();
    void notifTimeExpired();
    void notifPagoRealiz();
    void notifPagoExito();
    void notifErrorDev();
    void notifEventoCancel();
    void notifSoluFail();
    void notifSoluExito();
    void notifUsuarioSolu();
    void notificacionConflicto();
    void modificacionCanales();
    void notifError();
}
