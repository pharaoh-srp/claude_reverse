package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hpj implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ zqj F;

    public hpj(zqj zqjVar, rnk rnkVar, int i) {
        this.E = i;
        switch (i) {
            case 5:
                Objects.requireNonNull(zqjVar);
                this.F = zqjVar;
                break;
            default:
                Objects.requireNonNull(zqjVar);
                this.F = zqjVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
                this.F.H("onConnectedNodes");
                break;
            case 1:
                this.F.H("onConnectedCapabilityChanged");
                break;
            case 2:
                this.F.H("onNotificationReceived");
                break;
            case 3:
                this.F.H("onEntityUpdate");
                break;
            case 4:
                this.F.H("onPeerConnected");
                break;
            default:
                this.F.H("onPeerDisconnected");
                break;
        }
    }

    public hpj(zqj zqjVar, gsj gsjVar) {
        this.E = 1;
        Objects.requireNonNull(zqjVar);
        this.F = zqjVar;
    }

    public hpj(zqj zqjVar, ArrayList arrayList) {
        this.E = 0;
        Objects.requireNonNull(zqjVar);
        this.F = zqjVar;
    }

    public hpj(zqj zqjVar, xqk xqkVar) {
        this.E = 3;
        Objects.requireNonNull(zqjVar);
        this.F = zqjVar;
    }

    public hpj(zqj zqjVar, fxk fxkVar) {
        this.E = 2;
        Objects.requireNonNull(zqjVar);
        this.F = zqjVar;
    }
}
