package defpackage;

import com.google.crypto.tink.shaded.protobuf.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xf extends t3 {
    public final /* synthetic */ int G = 0;

    public xf(yf yfVar, byte b, char c) {
        super(3, nq9.class);
    }

    @Override // defpackage.t3
    public final a h(a aVar) {
        switch (this.G) {
            case 0:
                vf vfVar = (vf) aVar;
                rf rfVarC = sf.C();
                rfVarC.f();
                sf.w((sf) rfVarC.F);
                byte[] bArrA = i1e.a(vfVar.y());
                g22 g22VarE = k22.e(bArrA, 0, bArrA.length);
                rfVarC.f();
                sf.x((sf) rfVarC.F, g22VarE);
                cg cgVarZ = vfVar.z();
                rfVarC.f();
                sf.y((sf) rfVarC.F, cgVarZ);
                return (sf) rfVarC.b();
            case 1:
                hg hgVar = (hg) aVar;
                wf[] wfVarArr = {new wf(2, jg.class)};
                HashMap map = new HashMap();
                for (wf wfVar : wfVarArr) {
                    boolean zContainsKey = map.containsKey(wfVar.a);
                    Class cls = wfVar.a;
                    if (zContainsKey) {
                        sz6.p(vb7.o(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map.put(cls, wfVar);
                }
                if (wfVarArr.length > 0) {
                    Class cls2 = wfVarArr[0].a;
                }
                Collections.unmodifiableMap(map);
                ng ngVarY = hgVar.y();
                kg kgVarD = lg.D();
                pg pgVarA = ngVarY.A();
                kgVarD.f();
                lg.x((lg) kgVarD.F, pgVarA);
                byte[] bArrA2 = i1e.a(ngVarY.z());
                g22 g22VarE2 = k22.e(bArrA2, 0, bArrA2.length);
                kgVarD.f();
                lg.y((lg) kgVarD.F, g22VarE2);
                kgVarD.f();
                lg.w((lg) kgVarD.F);
                lg lgVar = (lg) kgVarD.b();
                wf[] wfVarArr2 = {new wf(8, doa.class)};
                HashMap map2 = new HashMap();
                for (wf wfVar2 : wfVarArr2) {
                    boolean zContainsKey2 = map2.containsKey(wfVar2.a);
                    Class cls3 = wfVar2.a;
                    if (zContainsKey2) {
                        sz6.p(vb7.o(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map2.put(cls3, wfVar2);
                }
                if (wfVarArr2.length > 0) {
                    Class cls4 = wfVarArr2[0].a;
                }
                Collections.unmodifiableMap(map2);
                in8 in8VarZ = hgVar.z();
                en8 en8VarD = fn8.D();
                en8VarD.f();
                fn8.w((fn8) en8VarD.F);
                ln8 ln8VarA = in8VarZ.A();
                en8VarD.f();
                fn8.x((fn8) en8VarD.F, ln8VarA);
                byte[] bArrA3 = i1e.a(in8VarZ.z());
                g22 g22VarE3 = k22.e(bArrA3, 0, bArrA3.length);
                en8VarD.f();
                fn8.y((fn8) en8VarD.F, g22VarE3);
                fn8 fn8Var = (fn8) en8VarD.b();
                eg egVarC = fg.C();
                egVarC.f();
                fg.x((fg) egVarC.F, lgVar);
                egVarC.f();
                fg.y((fg) egVarC.F, fn8Var);
                egVarC.f();
                fg.w((fg) egVarC.F);
                return (fg) egVarC.b();
            case 2:
                vg vgVar = (vg) aVar;
                rg rgVarC = sg.C();
                byte[] bArrA4 = i1e.a(vgVar.y());
                g22 g22VarE4 = k22.e(bArrA4, 0, bArrA4.length);
                rgVarC.f();
                sg.y((sg) rgVarC.F, g22VarE4);
                zg zgVarZ = vgVar.z();
                rgVarC.f();
                sg.x((sg) rgVarC.F, zgVarZ);
                rgVarC.f();
                sg.w((sg) rgVarC.F);
                return (sg) rgVarC.b();
            case 3:
                ch chVarA = dh.A();
                byte[] bArrA5 = i1e.a(((gh) aVar).x());
                g22 g22VarE5 = k22.e(bArrA5, 0, bArrA5.length);
                chVarA.f();
                dh.x((dh) chVarA.F, g22VarE5);
                chVarA.f();
                dh.w((dh) chVarA.F);
                return (dh) chVarA.b();
            case 4:
                kh khVarA = lh.A();
                byte[] bArrA6 = i1e.a(((oh) aVar).x());
                g22 g22VarE6 = k22.e(bArrA6, 0, bArrA6.length);
                khVarA.f();
                lh.x((lh) khVarA.F, g22VarE6);
                khVarA.f();
                lh.w((lh) khVarA.F);
                return (lh) khVarA.b();
            case 5:
                sh shVarA = th.A();
                byte[] bArrA7 = i1e.a(((vh) aVar).x());
                g22 g22VarE7 = k22.e(bArrA7, 0, bArrA7.length);
                shVarA.f();
                th.x((th) shVarA.F, g22VarE7);
                shVarA.f();
                th.w((th) shVarA.F);
                return (th) shVarA.b();
            case 6:
                mg2 mg2VarA = ng2.A();
                mg2VarA.f();
                ng2.w((ng2) mg2VarA.F);
                byte[] bArrA8 = i1e.a(32);
                g22 g22VarE8 = k22.e(bArrA8, 0, bArrA8.length);
                mg2VarA.f();
                ng2.x((ng2) mg2VarA.F, g22VarE8);
                return (ng2) mg2VarA.b();
            case 7:
                in8 in8Var = (in8) aVar;
                en8 en8VarD2 = fn8.D();
                en8VarD2.f();
                fn8.w((fn8) en8VarD2.F);
                ln8 ln8VarA2 = in8Var.A();
                en8VarD2.f();
                fn8.x((fn8) en8VarD2.F, ln8VarA2);
                byte[] bArrA9 = i1e.a(in8Var.z());
                g22 g22VarE9 = k22.e(bArrA9, 0, bArrA9.length);
                en8VarD2.f();
                fn8.y((fn8) en8VarD2.F, g22VarE9);
                return (fn8) en8VarD2.b();
            case 8:
                lq9 lq9VarA = mq9.A();
                lq9VarA.f();
                mq9.x((mq9) lq9VarA.F, (nq9) aVar);
                lq9VarA.f();
                mq9.w((mq9) lq9VarA.F);
                return (mq9) lq9VarA.b();
            case 9:
                qq9 qq9VarA = rq9.A();
                qq9VarA.f();
                rq9.x((rq9) qq9VarA.F, (sq9) aVar);
                qq9VarA.f();
                rq9.w((rq9) qq9VarA.F);
                return (rq9) qq9VarA.b();
            default:
                tij tijVarA = uij.A();
                tijVarA.f();
                uij.w((uij) tijVarA.F);
                byte[] bArrA10 = i1e.a(32);
                g22 g22VarE10 = k22.e(bArrA10, 0, bArrA10.length);
                tijVarA.f();
                uij.x((uij) tijVarA.F, g22VarE10);
                return (uij) tijVarA.b();
        }
    }

    @Override // defpackage.t3
    public Map l() {
        switch (this.G) {
            case 0:
                HashMap map = new HashMap();
                uf ufVarA = vf.A();
                ufVarA.f();
                vf.w((vf) ufVarA.F);
                bg bgVarZ = cg.z();
                bgVarZ.f();
                cg.w((cg) bgVarZ.F);
                cg cgVar = (cg) bgVarZ.b();
                ufVarA.f();
                vf.x((vf) ufVarA.F, cgVar);
                map.put("AES_CMAC", new ip9((vf) ufVarA.b(), 1));
                uf ufVarA2 = vf.A();
                ufVarA2.f();
                vf.w((vf) ufVarA2.F);
                bg bgVarZ2 = cg.z();
                bgVarZ2.f();
                cg.w((cg) bgVarZ2.F);
                cg cgVar2 = (cg) bgVarZ2.b();
                ufVarA2.f();
                vf.x((vf) ufVarA2.F, cgVar2);
                map.put("AES256_CMAC", new ip9((vf) ufVarA2.b(), 1));
                uf ufVarA3 = vf.A();
                ufVarA3.f();
                vf.w((vf) ufVarA3.F);
                bg bgVarZ3 = cg.z();
                bgVarZ3.f();
                cg.w((cg) bgVarZ3.F);
                cg cgVar3 = (cg) bgVarZ3.b();
                ufVarA3.f();
                vf.x((vf) ufVarA3.F, cgVar3);
                map.put("AES256_CMAC_RAW", new ip9((vf) ufVarA3.b(), 3));
                return Collections.unmodifiableMap(map);
            case 1:
                HashMap map2 = new HashMap();
                map2.put("AES128_CTR_HMAC_SHA256", yf.b(16, 16, 1));
                map2.put("AES128_CTR_HMAC_SHA256_RAW", yf.b(16, 16, 3));
                map2.put("AES256_CTR_HMAC_SHA256", yf.b(32, 32, 1));
                map2.put("AES256_CTR_HMAC_SHA256_RAW", yf.b(32, 32, 3));
                return Collections.unmodifiableMap(map2);
            case 2:
                HashMap map3 = new HashMap();
                map3.put("AES128_EAX", yf.a(16, 1));
                map3.put("AES128_EAX_RAW", yf.a(16, 3));
                map3.put("AES256_EAX", yf.a(32, 1));
                map3.put("AES256_EAX_RAW", yf.a(32, 3));
                return Collections.unmodifiableMap(map3);
            case 3:
                HashMap map4 = new HashMap();
                map4.put("AES128_GCM", yf.c(16, 1));
                map4.put("AES128_GCM_RAW", yf.c(16, 3));
                map4.put("AES256_GCM", yf.c(32, 1));
                map4.put("AES256_GCM_RAW", yf.c(32, 3));
                return Collections.unmodifiableMap(map4);
            case 4:
                HashMap map5 = new HashMap();
                map5.put("AES128_GCM_SIV", yf.d(16, 1));
                map5.put("AES128_GCM_SIV_RAW", yf.d(16, 3));
                map5.put("AES256_GCM_SIV", yf.d(32, 1));
                map5.put("AES256_GCM_SIV_RAW", yf.d(32, 3));
                return Collections.unmodifiableMap(map5);
            case 5:
                HashMap map6 = new HashMap();
                uh uhVarY = vh.y();
                uhVarY.f();
                vh.w((vh) uhVarY.F);
                map6.put("AES256_SIV", new ip9((vh) uhVarY.b(), 1));
                uh uhVarY2 = vh.y();
                uhVarY2.f();
                vh.w((vh) uhVarY2.F);
                map6.put("AES256_SIV_RAW", new ip9((vh) uhVarY2.b(), 3));
                return Collections.unmodifiableMap(map6);
            case 6:
                HashMap map7 = new HashMap();
                map7.put("CHACHA20_POLY1305", new ip9(qg2.w(), 1));
                map7.put("CHACHA20_POLY1305_RAW", new ip9(qg2.w(), 3));
                return Collections.unmodifiableMap(map7);
            case 7:
                HashMap map8 = new HashMap();
                zf8 zf8Var = zf8.SHA256;
                map8.put("HMAC_SHA256_128BITTAG", yf.e(32, 16, zf8Var, 1));
                map8.put("HMAC_SHA256_128BITTAG_RAW", yf.e(32, 16, zf8Var, 3));
                map8.put("HMAC_SHA256_256BITTAG", yf.e(32, 32, zf8Var, 1));
                map8.put("HMAC_SHA256_256BITTAG_RAW", yf.e(32, 32, zf8Var, 3));
                zf8 zf8Var2 = zf8.SHA512;
                map8.put("HMAC_SHA512_128BITTAG", yf.e(64, 16, zf8Var2, 1));
                map8.put("HMAC_SHA512_128BITTAG_RAW", yf.e(64, 16, zf8Var2, 3));
                map8.put("HMAC_SHA512_256BITTAG", yf.e(64, 32, zf8Var2, 1));
                map8.put("HMAC_SHA512_256BITTAG_RAW", yf.e(64, 32, zf8Var2, 3));
                map8.put("HMAC_SHA512_512BITTAG", yf.e(64, 64, zf8Var2, 1));
                map8.put("HMAC_SHA512_512BITTAG_RAW", yf.e(64, 64, zf8Var2, 3));
                return Collections.unmodifiableMap(map8);
            case 8:
            case 9:
            default:
                return super.l();
            case 10:
                HashMap map9 = new HashMap();
                map9.put("XCHACHA20_POLY1305", new ip9(wij.w(), 1));
                map9.put("XCHACHA20_POLY1305_RAW", new ip9(wij.w(), 3));
                return Collections.unmodifiableMap(map9);
        }
    }

    @Override // defpackage.t3
    public final a m(k22 k22Var) {
        switch (this.G) {
            case 0:
                return vf.B(k22Var, mc7.a());
            case 1:
                return hg.B(k22Var, mc7.a());
            case 2:
                return vg.B(k22Var, mc7.a());
            case 3:
                return gh.z(k22Var, mc7.a());
            case 4:
                return oh.z(k22Var, mc7.a());
            case 5:
                return vh.z(k22Var, mc7.a());
            case 6:
                return qg2.x(k22Var, mc7.a());
            case 7:
                return in8.C(k22Var, mc7.a());
            case 8:
                return nq9.y(k22Var, mc7.a());
            case 9:
                return sq9.A(k22Var, mc7.a());
            default:
                return wij.x(k22Var, mc7.a());
        }
    }

    @Override // defpackage.t3
    public final void o(a aVar) throws GeneralSecurityException {
        switch (this.G) {
            case 0:
                vf vfVar = (vf) aVar;
                yf.j(vfVar.z());
                if (vfVar.y() == 32) {
                    return;
                }
                rl7.j("AesCmacKey size wrong, must be 32 bytes");
                return;
            case 1:
                hg hgVar = (hg) aVar;
                wf[] wfVarArr = {new wf(2, jg.class)};
                HashMap map = new HashMap();
                for (wf wfVar : wfVarArr) {
                    boolean zContainsKey = map.containsKey(wfVar.a);
                    Class cls = wfVar.a;
                    if (zContainsKey) {
                        sz6.p(vb7.o(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return;
                    }
                    map.put(cls, wfVar);
                }
                if (wfVarArr.length > 0) {
                    Class cls2 = wfVarArr[0].a;
                }
                Collections.unmodifiableMap(map);
                ng ngVarY = hgVar.y();
                rqi.a(ngVarY.z());
                pg pgVarA = ngVarY.A();
                if (pgVarA.y() < 12 || pgVarA.y() > 16) {
                    rl7.j("invalid IV size");
                    return;
                }
                wf[] wfVarArr2 = {new wf(8, doa.class)};
                HashMap map2 = new HashMap();
                for (wf wfVar2 : wfVarArr2) {
                    boolean zContainsKey2 = map2.containsKey(wfVar2.a);
                    Class cls3 = wfVar2.a;
                    if (zContainsKey2) {
                        sz6.p(vb7.o(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return;
                    }
                    map2.put(cls3, wfVar2);
                }
                if (wfVarArr2.length > 0) {
                    Class cls4 = wfVarArr2[0].a;
                }
                Collections.unmodifiableMap(map2);
                in8 in8VarZ = hgVar.z();
                if (in8VarZ.z() < 16) {
                    rl7.j("key too short");
                    return;
                } else {
                    yf.k(in8VarZ.A());
                    rqi.a(hgVar.y().z());
                    return;
                }
            case 2:
                vg vgVar = (vg) aVar;
                rqi.a(vgVar.y());
                if (vgVar.z().y() == 12 || vgVar.z().y() == 16) {
                    return;
                }
                rl7.j("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 3:
                rqi.a(((gh) aVar).x());
                return;
            case 4:
                rqi.a(((oh) aVar).x());
                return;
            case 5:
                vh vhVar = (vh) aVar;
                if (vhVar.x() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + vhVar.x() + ". Valid keys must have 64 bytes.");
            case 6:
                return;
            case 7:
                in8 in8Var = (in8) aVar;
                if (in8Var.z() >= 16) {
                    yf.k(in8Var.A());
                    return;
                } else {
                    rl7.j("key too short");
                    return;
                }
            case 8:
                return;
            case 9:
                sq9 sq9Var = (sq9) aVar;
                if (sq9Var.y().isEmpty() || !sq9Var.z()) {
                    rl7.j("invalid key format: missing KEK URI or DEK template");
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ xf(Class cls) {
        super(3, cls);
    }

    public xf(yf yfVar, byte b, int i) {
        super(3, sq9.class);
    }

    public xf(yf yfVar, char c) {
        super(3, gh.class);
    }

    public xf(yf yfVar, byte b) {
        super(3, vg.class);
    }

    public xf(yf yfVar, byte b, boolean z) {
        super(3, qg2.class);
    }

    public xf(yf yfVar, int i) {
        super(3, oh.class);
    }

    public xf(yf yfVar, byte b, short s) {
        super(3, wij.class);
    }

    public xf(yf yfVar, short s) {
        super(3, vh.class);
    }

    public xf(yf yfVar) {
        super(3, hg.class);
    }

    public xf(yf yfVar, byte b, byte b2) {
        super(3, in8.class);
    }
}
