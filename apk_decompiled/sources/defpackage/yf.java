package defpackage;

import com.google.crypto.tink.shaded.protobuf.a;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yf {
    public static final ifd e = new ifd(tf.class, new wg6(8));
    public static final ifd f = new ifd(gn8.class, new rl7(7));
    public final Class a;
    public final Map b;
    public final Class c;
    public final /* synthetic */ int d;

    public yf(Class cls, wf... wfVarArr) {
        this.a = cls;
        HashMap map = new HashMap();
        for (wf wfVar : wfVarArr) {
            boolean zContainsKey = map.containsKey(wfVar.a);
            Class cls2 = wfVar.a;
            if (zContainsKey) {
                sz6.p(vb7.o(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                throw null;
            }
            map.put(cls2, wfVar);
        }
        if (wfVarArr.length > 0) {
            this.c = wfVarArr[0].a;
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(map);
    }

    public static ip9 a(int i, int i2) {
        ug ugVarA = vg.A();
        ugVarA.f();
        vg.x((vg) ugVarA.F, i);
        yg ygVarZ = zg.z();
        ygVarZ.f();
        zg.w((zg) ygVarZ.F);
        zg zgVar = (zg) ygVarZ.b();
        ugVarA.f();
        vg.w((vg) ugVarA.F, zgVar);
        return new ip9((vg) ugVarA.b(), i2);
    }

    public static ip9 b(int i, int i2, int i3) {
        mg mgVarB = ng.B();
        og ogVarZ = pg.z();
        ogVarZ.f();
        pg.w((pg) ogVarZ.F);
        pg pgVar = (pg) ogVarZ.b();
        mgVarB.f();
        ng.w((ng) mgVarB.F, pgVar);
        mgVarB.f();
        ng.x((ng) mgVarB.F, i);
        ng ngVar = (ng) mgVarB.b();
        hn8 hn8VarB = in8.B();
        kn8 kn8VarB = ln8.B();
        kn8VarB.f();
        ln8.w((ln8) kn8VarB.F, zf8.SHA256);
        kn8VarB.f();
        ln8.x((ln8) kn8VarB.F, i2);
        ln8 ln8Var = (ln8) kn8VarB.b();
        hn8VarB.f();
        in8.w((in8) hn8VarB.F, ln8Var);
        hn8VarB.f();
        in8.x((in8) hn8VarB.F, 32);
        in8 in8Var = (in8) hn8VarB.b();
        gg ggVarA = hg.A();
        ggVarA.f();
        hg.w((hg) ggVarA.F, ngVar);
        ggVarA.f();
        hg.x((hg) ggVarA.F, in8Var);
        return new ip9((hg) ggVarA.b(), i3);
    }

    public static ip9 c(int i, int i2) {
        fh fhVarY = gh.y();
        fhVarY.f();
        gh.w((gh) fhVarY.F, i);
        return new ip9((gh) fhVarY.b(), i2);
    }

    public static ip9 d(int i, int i2) {
        nh nhVarY = oh.y();
        nhVarY.f();
        oh.w((oh) nhVarY.F, i);
        return new ip9((oh) nhVarY.b(), i2);
    }

    public static ip9 e(int i, int i2, zf8 zf8Var, int i3) {
        hn8 hn8VarB = in8.B();
        kn8 kn8VarB = ln8.B();
        kn8VarB.f();
        ln8.w((ln8) kn8VarB.F, zf8Var);
        kn8VarB.f();
        ln8.x((ln8) kn8VarB.F, i2);
        ln8 ln8Var = (ln8) kn8VarB.b();
        hn8VarB.f();
        in8.w((in8) hn8VarB.F, ln8Var);
        hn8VarB.f();
        in8.x((in8) hn8VarB.F, i);
        return new ip9((in8) hn8VarB.b(), i3);
    }

    public static void j(cg cgVar) {
        if (cgVar.y() < 10) {
            rl7.j("tag size too short");
        } else {
            if (cgVar.y() <= 16) {
                return;
            }
            rl7.j("tag size too long");
        }
    }

    public static void k(ln8 ln8Var) {
        if (ln8Var.A() < 10) {
            rl7.j("tag size too small");
            return;
        }
        int iOrdinal = ln8Var.z().ordinal();
        if (iOrdinal == 1) {
            if (ln8Var.A() <= 20) {
                return;
            }
            rl7.j("tag size too big");
            return;
        }
        if (iOrdinal == 2) {
            if (ln8Var.A() <= 48) {
                return;
            }
            rl7.j("tag size too big");
            return;
        }
        if (iOrdinal == 3) {
            if (ln8Var.A() <= 32) {
                return;
            }
            rl7.j("tag size too big");
        } else if (iOrdinal == 4) {
            if (ln8Var.A() <= 64) {
                return;
            }
            rl7.j("tag size too big");
        } else if (iOrdinal != 5) {
            rl7.j("unknown hash type");
        } else {
            if (ln8Var.A() <= 28) {
                return;
            }
            rl7.j("tag size too big");
        }
    }

    public final String f() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 8:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 9:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            default:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        }
    }

    public final t3 g() {
        switch (this.d) {
            case 0:
                return new xf(vf.class);
            case 1:
                return new xf(this, (byte) 0, (byte) 0);
            case 2:
                return new xf(this);
            case 3:
                return new xf(this, (byte) 0);
            case 4:
                return new xf(this, (char) 0);
            case 5:
                return new xf(this, 0);
            case 6:
                return new xf(this, (short) 0);
            case 7:
                return new xf(this, (byte) 0, false);
            case 8:
                return new xf(this, (byte) 0, (char) 0);
            case 9:
                return new xf(this, (byte) 0, 0);
            default:
                return new xf(this, (byte) 0, (short) 0);
        }
    }

    public final a h(k22 k22Var) {
        switch (this.d) {
            case 0:
                return sf.D(k22Var, mc7.a());
            case 1:
                return fn8.E(k22Var, mc7.a());
            case 2:
                return fg.D(k22Var, mc7.a());
            case 3:
                return sg.D(k22Var, mc7.a());
            case 4:
                return dh.B(k22Var, mc7.a());
            case 5:
                return lh.B(k22Var, mc7.a());
            case 6:
                return th.B(k22Var, mc7.a());
            case 7:
                return ng2.B(k22Var, mc7.a());
            case 8:
                return mq9.B(k22Var, mc7.a());
            case 9:
                return rq9.B(k22Var, mc7.a());
            default:
                return uij.B(k22Var, mc7.a());
        }
    }

    public final void i(a aVar) {
        switch (this.d) {
            case 0:
                sf sfVar = (sf) aVar;
                rqi.c(sfVar.B());
                if (sfVar.z().size() == 32) {
                    j(sfVar.A());
                    return;
                } else {
                    rl7.j("AesCmacKey size wrong, must be 32 bytes");
                    return;
                }
            case 1:
                fn8 fn8Var = (fn8) aVar;
                rqi.c(fn8Var.C());
                if (fn8Var.A().size() >= 16) {
                    k(fn8Var.B());
                    return;
                } else {
                    rl7.j("key too short");
                    return;
                }
            case 2:
                fg fgVar = (fg) aVar;
                rqi.c(fgVar.B());
                wf[] wfVarArr = {new wf(2, jg.class)};
                HashMap map = new HashMap();
                wf wfVar = wfVarArr[0];
                boolean zContainsKey = map.containsKey(wfVar.a);
                Class cls = wfVar.a;
                if (zContainsKey) {
                    sz6.p(vb7.o(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                map.put(cls, wfVar);
                Class cls2 = wfVarArr[0].a;
                Collections.unmodifiableMap(map);
                lg lgVarZ = fgVar.z();
                rqi.c(lgVarZ.C());
                rqi.a(lgVarZ.A().size());
                pg pgVarB = lgVarZ.B();
                if (pgVarB.y() < 12 || pgVarB.y() > 16) {
                    rl7.j("invalid IV size");
                    return;
                }
                wf[] wfVarArr2 = {new wf(8, doa.class)};
                HashMap map2 = new HashMap();
                wf wfVar2 = wfVarArr2[0];
                boolean zContainsKey2 = map2.containsKey(wfVar2.a);
                Class cls3 = wfVar2.a;
                if (zContainsKey2) {
                    sz6.p(vb7.o(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                map2.put(cls3, wfVar2);
                Class cls4 = wfVarArr2[0].a;
                Collections.unmodifiableMap(map2);
                fn8 fn8VarA = fgVar.A();
                rqi.c(fn8VarA.C());
                if (fn8VarA.A().size() >= 16) {
                    k(fn8VarA.B());
                    return;
                } else {
                    rl7.j("key too short");
                    return;
                }
            case 3:
                sg sgVar = (sg) aVar;
                rqi.c(sgVar.B());
                rqi.a(sgVar.z().size());
                if (sgVar.A().y() == 12 || sgVar.A().y() == 16) {
                    return;
                }
                rl7.j("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 4:
                dh dhVar = (dh) aVar;
                rqi.c(dhVar.z());
                rqi.a(dhVar.y().size());
                return;
            case 5:
                lh lhVar = (lh) aVar;
                rqi.c(lhVar.z());
                rqi.a(lhVar.y().size());
                return;
            case 6:
                th thVar = (th) aVar;
                rqi.c(thVar.z());
                if (thVar.y().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + thVar.y().size() + ". Valid keys must have 64 bytes.");
            case 7:
                ng2 ng2Var = (ng2) aVar;
                rqi.c(ng2Var.z());
                if (ng2Var.y().size() == 32) {
                    return;
                }
                rl7.j("invalid ChaCha20Poly1305Key: incorrect key length");
                return;
            case 8:
                rqi.c(((mq9) aVar).z());
                return;
            case 9:
                rqi.c(((rq9) aVar).z());
                return;
            default:
                uij uijVar = (uij) aVar;
                rqi.c(uijVar.z());
                if (uijVar.y().size() == 32) {
                    return;
                }
                rl7.j("invalid XChaCha20Poly1305Key: incorrect key length");
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yf() {
        this(fn8.class, new wf(8, doa.class));
        this.d = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf(Class cls, wf[] wfVarArr, int i) {
        this(cls, wfVarArr);
        this.d = i;
    }
}
