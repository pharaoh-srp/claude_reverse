package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class cac implements g9i {
    public final /* synthetic */ int E;
    public final /* synthetic */ f9i F;

    public /* synthetic */ cac(f9i f9iVar, int i) {
        this.E = i;
        this.F = f9iVar;
    }

    @Override // defpackage.g9i
    public final f9i a(xd8 xd8Var, dbi dbiVar) {
        int i = this.E;
        f9i f9iVar = this.F;
        switch (i) {
            case 0:
                if (dbiVar.a == Number.class) {
                }
                break;
            default:
                Class cls = dbiVar.a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                }
                break;
        }
        return (eac) f9iVar;
    }

    public String toString() {
        switch (this.E) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((eac) this.F) + "]";
            default:
                return super.toString();
        }
    }
}
