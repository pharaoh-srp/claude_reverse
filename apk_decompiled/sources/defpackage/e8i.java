package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e8i extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ j8i F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e8i(j8i j8iVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = j8iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        j8i j8iVar = this.F;
        switch (i) {
            case 0:
                return new e8i(j8iVar, tp4Var, 0);
            case 1:
                return new e8i(j8iVar, tp4Var, 1);
            case 2:
                return new e8i(j8iVar, tp4Var, 2);
            default:
                return new e8i(j8iVar, tp4Var, 3);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((e8i) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object hreVar;
        byte[] bArrQ0;
        int i = this.E;
        j8i j8iVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                u5e u5eVar = j8iVar.d;
                if (u5eVar.j() == null) {
                    u5eVar.b();
                }
                return Boolean.valueOf(u5eVar.i().containsAlias("trusted_device_reattest"));
            case 1:
                sf5.h0(obj);
                return j8iVar.d.j();
            case 2:
                sf5.h0(obj);
                return j8iVar.d.j();
            default:
                sf5.h0(obj);
                u5e u5eVar2 = j8iVar.d;
                byte[] bArr = z5e.a;
                String str = j8iVar.h;
                str.getClass();
                try {
                    hreVar = UUID.fromString(str);
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                if (hreVar instanceof hre) {
                    hreVar = null;
                }
                UUID uuid = (UUID) hreVar;
                byte[] bArrDigest = uuid == null ? null : MessageDigest.getInstance("SHA-256").digest(ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
                if (!u5eVar2.g()) {
                    return null;
                }
                try {
                    u5eVar2.i().deleteEntry("trusted_device_reattest");
                    break;
                } catch (Throwable unused) {
                }
                try {
                    u5eVar2.e("trusted_device_reattest", true, bArrDigest);
                    byte[] encoded = u5eVar2.i().getCertificate("trusted_device_reattest").getPublicKey().getEncoded();
                    if (bArrDigest != null) {
                        Certificate[] certificateChain = u5eVar2.i().getCertificateChain("trusted_device_reattest");
                        if (certificateChain != null) {
                            bArrQ0 = new byte[0];
                            for (Certificate certificate : certificateChain) {
                                byte[] encoded2 = certificate.getEncoded();
                                encoded2.getClass();
                                bArrQ0 = mp0.Q0(bArrQ0, encoded2);
                            }
                        } else {
                            bArrQ0 = new byte[0];
                        }
                    } else {
                        bArrQ0 = new byte[0];
                    }
                    encoded.getClass();
                    return new t5e(encoded, bArrQ0);
                } catch (Exception e) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        String strE = iuj.E(u5eVar2);
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj2)).getClass();
                            arrayList.add(obj2);
                        }
                        if (!arrayList.isEmpty()) {
                            String strQ = sq6.q(zfa.a, e, "ReattestKeyProvider.regenerateReattestKey failed: ");
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strQ);
                            }
                        }
                    }
                    try {
                        u5eVar2.i().deleteEntry("trusted_device_reattest");
                        return null;
                    } catch (Throwable unused2) {
                        return null;
                    }
                }
                break;
        }
    }
}
