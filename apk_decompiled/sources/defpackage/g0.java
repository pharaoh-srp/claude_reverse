package defpackage;

import android.view.KeyEvent;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ g0(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                ((es9) obj).getClass();
                return (j7g) ((h0) obj2).F.F.a();
            case 1:
                ((za2) obj2).cancel();
                return ieiVar;
            case 2:
                KeyEvent keyEventB = ((so9) obj).b();
                keyEventB.getClass();
                long jI = ssj.i(keyEventB);
                int i2 = no9.O;
                if ((no9.a(jI, t9e.i()) || no9.a(ssj.i(keyEventB), t9e.m())) && rkj.g(ssj.j(keyEventB), 2) && !ssj.n(keyEventB)) {
                    ((zy7) obj2).a();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                ((List) obj2).get(((Number) obj).intValue());
                return null;
            case 4:
                sxb sxbVar = (sxb) obj;
                uqb uqbVarK = ((or9) obj2).k();
                ww7 ww7Var = pkg.j;
                g1a g1aVar = uqbVarK.a0(ww7Var).K;
                if (g1aVar == null) {
                    or9.a(11);
                    throw null;
                }
                xh3 xh3VarE = g1aVar.e(sxbVar, 4);
                if (xh3VarE == null) {
                    mr9.g(ww7Var.c(sxbVar), " is not found", "Built-in class ");
                    return null;
                }
                if (xh3VarE instanceof qqb) {
                    return (qqb) xh3VarE;
                }
                throw new AssertionError("Must be a class descriptor " + sxbVar + ", but was " + xh3VarE);
            case 5:
                ((u82) obj2).cancel();
                return ieiVar;
            case 6:
                ((List) obj).getClass();
                return mp0.Y0((Object[]) obj2);
            case 7:
                String strM1071unboximpl = ((OrganizationId) obj).m1071unboximpl();
                strM1071unboximpl.getClass();
                m7f m7fVar = (m7f) obj2;
                kce kceVar = jce.a;
                return new okc(strM1071unboximpl, ((sc8) m7fVar.a(kceVar.b(sc8.class), null, null)).a(strM1071unboximpl), (q7) m7fVar.a(kceVar.b(q7.class), null, null), (lea) m7fVar.a(kceVar.b(lea.class), null, null), (gob) m7fVar.a(kceVar.b(gob.class), null, null), (vob) m7fVar.a(kceVar.b(vob.class), null, null), (mn5) m7fVar.a(kceVar.b(mn5.class), null, null));
            default:
                ((ua2) obj2).resumeWith(ieiVar);
                return ieiVar;
        }
    }
}
