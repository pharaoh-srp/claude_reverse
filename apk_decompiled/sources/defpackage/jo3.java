package defpackage;

import android.os.Handler;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.SessionId;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class jo3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public jo3(SessionResource sessionResource, nwb nwbVar, nwb nwbVar2, nwb nwbVar3) {
        this.E = 1;
        this.H = sessionResource;
        this.F = nwbVar;
        this.G = nwbVar2;
        this.I = nwbVar3;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        uz7 uz7Var;
        kdg kdgVar;
        int i = this.E;
        boolean z = false;
        iei ieiVar = iei.a;
        Object obj2 = this.I;
        Object obj3 = this.H;
        Object obj4 = this.G;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((so9) obj).a;
                zub zubVar = (zub) obj3;
                nwb nwbVar = (nwb) obj5;
                keyEvent.getClass();
                boolean z2 = no9.a(zsj.b(keyEvent.getKeyCode()), no9.r) || no9.a(zsj.b(keyEvent.getKeyCode()), no9.E) || no9.a(zsj.b(keyEvent.getKeyCode()), no9.q) || no9.a(zsj.b(keyEvent.getKeyCode()), no9.h);
                if (z2 && ssj.j(keyEvent) == 2 && nwbVar.getValue() == null) {
                    long jY = csg.y(((g79) ((nwb) obj4).getValue()).a);
                    odd oddVar = new odd((((long) Float.floatToRawIntBits((int) (jY & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jY >> 32))) << 32));
                    nwbVar.setValue(oddVar);
                    zubVar.c(oddVar);
                } else if (z2 && ssj.j(keyEvent) == 1 && nwbVar.getValue() != null) {
                    odd oddVar2 = (odd) nwbVar.getValue();
                    if (oddVar2 != null) {
                        zubVar.c(new pdd(oddVar2));
                    }
                    nwbVar.setValue(null);
                    ((zy7) obj2).a();
                }
                z = true;
                break;
            case 1:
                Object obj6 = ((jre) obj).E;
                ((nwb) obj5).setValue(null);
                if (obj6 instanceof hre) {
                    nwb nwbVar2 = (nwb) obj4;
                    String strM875getIdOcx55TE = ((SessionResource) obj3).m875getIdOcx55TE();
                    nwbVar2.setValue(strM875getIdOcx55TE != null ? SessionId.m1114boximpl(strM875getIdOcx55TE) : null);
                    nwb nwbVar3 = (nwb) obj2;
                    Throwable thA = jre.a(obj6);
                    nwbVar3.setValue(thA != null ? thA.getMessage() : null);
                }
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                gb9.D((l45) obj5, null, null, new cm((op3) obj4, str, (ybg) obj3, (String) obj2, null, 26), 3);
                break;
            case 3:
                x5a x5aVar = (x5a) obj;
                x5aVar.getClass();
                ii7 ii7Var = (ii7) obj5;
                n36 n36Var = (n36) obj4;
                long jA = n36Var.a();
                x5aVar.c.setValue(Boolean.FALSE);
                if (bsg.I0(x5aVar.a()) && (kdgVar = (kdg) ii7Var.h.get(Long.valueOf(jA))) != null) {
                    kdgVar.remove(x5aVar);
                }
                if (!bsg.I0(x5aVar.a()) && (uz7Var = (uz7) obj3) != null) {
                    uz7Var.l((String) obj2, Long.valueOf(n36Var.a()), n36Var.c, n36Var.d, n36Var.b, x5aVar.a());
                }
                break;
            default:
                SilentException.a(new SilentException("WebView PDF write failed"), ozf.F, false, 2);
                t5h.d((AtomicBoolean) obj5, (Handler) obj4, (ua2) obj3, (WebView) obj2, false);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jo3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }
}
