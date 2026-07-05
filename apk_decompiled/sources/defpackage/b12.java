package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes3.dex */
public final class b12 implements rz7 {
    public static final b12 F = new b12(0);
    public static final b12 G = new b12(1);
    public static final b12 H = new b12(2);
    public static final b12 I = new b12(3);
    public static final b12 J = new b12(4);
    public static final b12 K = new b12(5);
    public final /* synthetic */ int E;

    public /* synthetic */ b12(int i) {
        this.E = i;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jB;
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                a12 a12Var = (a12) obj;
                ((Number) obj3).intValue();
                a12Var.getClass();
                e18 e18Var = (e18) ((ld4) obj2);
                e18Var.a0(923773082);
                int iOrdinal = a12Var.ordinal();
                if (iOrdinal == 0) {
                    e18Var.a0(-1312295423);
                    jB = ((d54) e18Var.j(on4.a)).a;
                    e18Var.p(false);
                } else if (iOrdinal == 1) {
                    e18Var.a0(-1312293375);
                    jB = ((d54) e18Var.j(on4.a)).a;
                    e18Var.p(false);
                } else {
                    if (iOrdinal != 2) {
                        throw ebh.u(e18Var, -1312297468, false);
                    }
                    e18Var.a0(-1312290972);
                    jB = d54.b(0.38f, ((d54) e18Var.j(on4.a)).a);
                    e18Var.p(false);
                }
                e18Var.p(false);
                return new d54(jB);
            case 1:
                try {
                    fsh.w((pqe) obj2);
                    break;
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return ieiVar;
            case 2:
                pqe pqeVar = (pqe) obj2;
                ((Throwable) obj).getClass();
                pqeVar.getClass();
                ((c45) obj3).getClass();
                try {
                    pqeVar.close();
                    break;
                } catch (Throwable unused2) {
                }
                return ieiVar;
            case 3:
                ((Throwable) obj).getClass();
                ((c45) obj3).getClass();
                return ieiVar;
            case 4:
                String strM1057unboximpl = ((MessageId) obj2).m1057unboximpl();
                ((Number) obj3).intValue();
                ((ChatMessageActionEvents$ActionSource) obj).getClass();
                strM1057unboximpl.getClass();
                return ieiVar;
            default:
                xd6 xd6Var = (xd6) obj;
                long j = ((fcc) obj2).a;
                long j2 = ((d54) obj3).a;
                aag aagVar = aag.a;
                xd6.C0(xd6Var, j2, xd6Var.q0(aag.c) / 2.0f, j, null, 120);
                return ieiVar;
        }
    }
}
