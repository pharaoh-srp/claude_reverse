package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gx8 {
    public final Context a;
    public ct5 b;
    public Object c;
    public z4h d;
    public uad e;
    public final List f;
    public s5i g;
    public final gmf h;
    public final LinkedHashMap i;
    public final boolean j;
    public final boolean k;
    public final vf3 l;
    public y8g m;
    public j6f n;
    public c4a o;
    public y8g p;
    public j6f q;

    public gx8(kx8 kx8Var, Context context) {
        this.a = context;
        this.b = kx8Var.z;
        this.c = kx8Var.b;
        this.d = kx8Var.c;
        ew5 ew5Var = kx8Var.y;
        this.e = ew5Var.d;
        this.f = kx8Var.f;
        this.g = ew5Var.c;
        this.h = kx8Var.h.g();
        this.i = sta.t0(kx8Var.i.a);
        this.j = kx8Var.j;
        this.k = kx8Var.m;
        this.l = new vf3(kx8Var.x);
        this.m = ew5Var.a;
        this.n = ew5Var.b;
        if (kx8Var.a == context) {
            this.o = kx8Var.u;
            this.p = kx8Var.v;
            this.q = kx8Var.w;
        } else {
            this.o = null;
            this.p = null;
            this.q = null;
        }
    }

    public final kx8 a() {
        y8g y8gVar;
        Object obj = this.c;
        if (obj == null) {
            obj = lyk.S;
        }
        Object obj2 = obj;
        z4h z4hVar = this.d;
        ct5 ct5Var = this.b;
        Bitmap.Config config = ct5Var.g;
        uad uadVar = this.e;
        if (uadVar == null) {
            uadVar = ct5Var.f;
        }
        uad uadVar2 = uadVar;
        s5i s5iVar = this.g;
        if (s5iVar == null) {
            s5iVar = ct5Var.e;
        }
        s5i s5iVar2 = s5iVar;
        gmf gmfVar = this.h;
        wg8 wg8VarV = gmfVar != null ? gmfVar.v() : null;
        if (wg8VarV == null) {
            wg8VarV = l.c;
        } else {
            Bitmap.Config[] configArr = l.a;
        }
        wg8 wg8Var = wg8VarV;
        LinkedHashMap linkedHashMap = this.i;
        h4h h4hVar = linkedHashMap != null ? new h4h(ajk.t(linkedHashMap)) : null;
        if (h4hVar == null) {
            h4hVar = h4h.b;
        }
        h4h h4hVar2 = h4hVar;
        ct5 ct5Var2 = this.b;
        boolean z = ct5Var2.h;
        ct5Var2.getClass();
        ct5 ct5Var3 = this.b;
        f52 f52Var = ct5Var3.i;
        f52 f52Var2 = ct5Var3.j;
        f52 f52Var3 = ct5Var3.k;
        e45 e45Var = ct5Var3.a;
        e45 e45Var2 = ct5Var3.b;
        e45 e45Var3 = ct5Var3.c;
        e45 e45Var4 = ct5Var3.d;
        c4a c4aVarA = this.o;
        Context context = this.a;
        if (c4aVarA == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof m4a) {
                    c4aVarA = ((m4a) baseContext).a();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    c4aVarA = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (c4aVarA == null) {
                c4aVarA = p78.b;
            }
        }
        c4a c4aVar = c4aVarA;
        y8g y8gVar2 = this.m;
        if (y8gVar2 == null) {
            y8g t86Var = this.p;
            if (t86Var == null) {
                t86Var = new t86(context);
            }
            y8gVar = t86Var;
        } else {
            y8gVar = y8gVar2;
        }
        j6f j6fVar = this.n;
        if (j6fVar == null && (j6fVar = this.q) == null) {
            if ((y8gVar2 instanceof myi ? (myi) y8gVar2 : null) != null) {
                throw null;
            }
            j6fVar = j6f.F;
        }
        j6f j6fVar2 = j6fVar;
        vf3 vf3Var = this.l;
        asc ascVar = vf3Var != null ? new asc(ajk.t(vf3Var.a)) : null;
        if (ascVar == null) {
            ascVar = asc.F;
        }
        return new kx8(context, obj2, z4hVar, config, uadVar2, this.f, s5iVar2, wg8Var, h4hVar2, this.j, z, false, this.k, f52Var, f52Var2, f52Var3, e45Var, e45Var2, e45Var3, e45Var4, c4aVar, y8gVar, j6fVar2, ascVar, new ew5(this.m, this.n, this.g, this.e), this.b);
    }

    public gx8(Context context) {
        this.a = context;
        this.b = k.a;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = lm6.E;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = true;
        this.k = true;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }
}
