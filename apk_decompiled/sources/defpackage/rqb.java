package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class rqb {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final hze a(Class cls) {
        bf bfVarI;
        x4d x4dVarI;
        cls.getClass();
        ClassLoader classLoaderD = yae.d(cls);
        n6j n6jVar = new n6j(classLoaderD);
        ConcurrentHashMap concurrentHashMap = a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(n6jVar);
        if (weakReference != null) {
            hze hzeVar = (hze) weakReference.get();
            if (hzeVar != null) {
                return hzeVar;
            }
            concurrentHashMap.remove(n6jVar, weakReference);
        }
        int i = 24;
        gmf gmfVar = new gmf(i, classLoaderD);
        ClassLoader classLoader = iei.class.getClassLoader();
        classLoader.getClass();
        gmf gmfVar2 = new gmf(i, classLoader);
        kbe kbeVar = new kbe(classLoaderD);
        dd8 dd8Var = dd8.M;
        ql8 ql8Var = ql8.L;
        gfa gfaVar = new gfa("DeserializationComponentsForJava.ModuleData");
        rj9 rj9Var = new rj9(gfaVar);
        uqb uqbVar = new uqb(sxb.g("<" + ("runtime module for " + classLoaderD) + '>'), gfaVar, rj9Var, 56);
        f7g f7gVar = gfaVar.a;
        f7gVar.lock();
        Throwable th = null;
        try {
            if (rj9Var.a != null) {
                throw new AssertionError("Built-ins module is already set: " + rj9Var.a + " (attempting to reset to " + uqbVar + ")");
            }
            rj9Var.a = uqbVar;
            f7gVar.unlock();
            char c = 0;
            rj9Var.f = new qj9(uqbVar, c);
            f16 f16Var = new f16();
            efe efeVar = new efe(26, c);
            dpf dpfVar = new dpf(gfaVar, uqbVar);
            efk efkVar = efk.M;
            lz1 lz1Var = lz1.R;
            lz1 lz1Var2 = lz1.L;
            ql8 ql8Var2 = new ql8(gfaVar);
            zp3 zp3Var = zp3.Y;
            lz1 lz1Var3 = lz1.M;
            qce qceVar = new qce(uqbVar, dpfVar);
            bf9 bf9Var = bf9.c;
            rc0 rc0Var = new rc0(bf9Var);
            a5 a5Var = a5.J;
            a5 a5Var2 = new a5(28, new ql8(20));
            k2e k2eVar = k2e.I;
            c3c.b.getClass();
            d3c d3cVar = b3c.b;
            cy9 cy9Var = new cy9(new ke9(gfaVar, kbeVar, gmfVar, f16Var, lz1Var, dd8Var, lz1Var2, ql8Var2, ql8Var, efeVar, efkVar, zp3Var, lz1Var3, uqbVar, qceVar, rc0Var, a5Var2, k2eVar, a5Var, d3cVar, bf9Var, new vz8(17)));
            jk9 jk9Var = jk9.g;
            jk9Var.getClass();
            q28 q28Var = new q28(gmfVar, 6, f16Var);
            rl rlVar = new rl();
            rlVar.F = gmfVar;
            rlVar.G = gfaVar.b(new e0(c, rlVar));
            rlVar.H = uqbVar;
            rlVar.I = dpfVar;
            rlVar.E = new nyj(uqbVar, dpfVar);
            rlVar.J = jk9.g;
            rlVar.J = jk9Var;
            List listW = x44.W(mv5.a);
            or9 or9Var = uqbVar.H;
            rj9 rj9Var2 = or9Var instanceof rj9 ? (rj9) or9Var : null;
            efk efkVar2 = efk.K;
            if (rj9Var2 == null || (bfVarI = rj9Var2.I()) == null) {
                bfVarI = lz1.G;
            }
            bf bfVar = bfVarI;
            if (rj9Var2 == null || (x4dVarI = rj9Var2.I()) == null) {
                x4dVarI = ql8.K;
            }
            r06 r06Var = new r06(gfaVar, uqbVar, q28Var, rlVar, cy9Var, dd8Var, efkVar2, lm6.E, dpfVar, bfVar, x4dVarI, fl9.a, d3cVar, new ql8(gfaVar), listW, 262144);
            f16Var.a = r06Var;
            efeVar.F = new tk5(16, cy9Var);
            xj9 xj9Var = new xj9(gfaVar, gmfVar2, uqbVar, dpfVar, rj9Var.I(), rj9Var.I(), d3cVar, new ql8(gfaVar));
            uqbVar.K = new d86(mp0.Y0(new uqb[]{uqbVar}));
            uqbVar.L = new be4(x44.X(cy9Var, xj9Var), "CompositeProvider@RuntimeModuleData for " + uqbVar);
            hze hzeVar2 = new hze(r06Var, new w3c(f16Var, gmfVar));
            while (true) {
                WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(n6jVar, new WeakReference(hzeVar2));
                if (weakReference2 == null) {
                    return hzeVar2;
                }
                hze hzeVar3 = (hze) weakReference2.get();
                if (hzeVar3 != null) {
                    return hzeVar3;
                }
                concurrentHashMap.remove(n6jVar, weakReference2);
            }
        } finally {
        }
    }
}
