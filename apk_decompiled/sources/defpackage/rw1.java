package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class rw1 {
    public boolean a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public rw1(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.a = true;
        this.b = true;
        this.d = iconCompat;
        this.e = o7c.d(charSequence);
        this.f = pendingIntent;
        this.g = bundle;
        this.h = null;
        this.a = true;
        this.b = true;
        this.c = false;
    }

    public static rw1 b(edh edhVar, l42 l42Var, l42 l42Var2, rw1 rw1Var, yy5 yy5Var) {
        return new rw1(edhVar, l42Var, l42Var2, rw1Var, yy5Var, true);
    }

    public static rw1 c(edh edhVar, l42 l42Var, l42 l42Var2, rw1 rw1Var, yy5 yy5Var) {
        return new rw1(edhVar, l42Var, l42Var2, rw1Var, yy5Var, false);
    }

    public k7c a() {
        CharSequence[] charSequenceArr;
        Set set;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<bfe> arrayList3 = (ArrayList) this.h;
        if (arrayList3 != null) {
            for (bfe bfeVar : arrayList3) {
                if (bfeVar.d || (!((charSequenceArr = bfeVar.c) == null || charSequenceArr.length == 0) || (set = bfeVar.g) == null || set.isEmpty())) {
                    arrayList2.add(bfeVar);
                } else {
                    arrayList.add(bfeVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new k7c((IconCompat) this.d, (CharSequence) this.e, (PendingIntent) this.f, (Bundle) this.g, arrayList2.isEmpty() ? null : (bfe[]) arrayList2.toArray(new bfe[arrayList2.size()]), this.a, 0, this.b, false, this.c);
    }

    public rw1(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle());
    }

    public rw1(String str, PendingIntent pendingIntent) {
        this(null, str, pendingIntent, new Bundle());
    }

    public rw1(edh edhVar, l42 l42Var, l42 l42Var2, rw1 rw1Var, yy5 yy5Var, boolean z) {
        this.b = true;
        this.c = false;
        this.d = edhVar;
        this.e = l42Var;
        this.f = l42Var2;
        this.a = z;
        this.g = rw1Var;
        this.h = yy5Var;
    }
}
