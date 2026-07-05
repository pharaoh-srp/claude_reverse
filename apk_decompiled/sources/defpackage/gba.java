package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gba implements Handler.Callback {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ gba(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                kba kbaVar = (kba) obj;
                iba ibaVar = kbaVar.c;
                ibaVar.getClass();
                for (jba jbaVar : kbaVar.d) {
                    if (!jbaVar.d && jbaVar.c) {
                        en7 en7VarB = jbaVar.b.b();
                        jbaVar.b = new z5l();
                        jbaVar.c = false;
                        ibaVar.f(jbaVar.a, en7VarB);
                    }
                    k1h k1hVar = kbaVar.b;
                    k1hVar.getClass();
                    if (k1hVar.a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            default:
                co1 co1Var = (co1) obj;
                int i2 = message.what;
                if (i2 == 1) {
                    ((vtg) co1Var.g).a();
                } else if (i2 == 2) {
                    ((wtg) co1Var.h).a();
                } else if (i2 == 3) {
                    ((xtg) co1Var.i).a();
                } else if (i2 == 4) {
                    ((ytg) co1Var.j).a();
                }
                break;
        }
        return true;
    }
}
