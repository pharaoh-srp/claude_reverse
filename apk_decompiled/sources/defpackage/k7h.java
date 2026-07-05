package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.account.VillageWeaverConsentState;
import com.anthropic.claude.artifact.model.ArtifactType;
import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class k7h extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7h(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                return new k7h((String) this.G, (nfb) obj2, tp4Var, 0);
            case 1:
                return new k7h((oo9) this.G, (vfh) obj2, tp4Var, 1);
            case 2:
                k7h k7hVar = new k7h((j8i) obj2, tp4Var, 2);
                k7hVar.G = obj;
                return k7hVar;
            case 3:
                return new k7h(obj2, (String) this.G, tp4Var, 3);
            case 4:
                k7h k7hVar2 = new k7h((lp7) obj2, tp4Var, 4);
                k7hVar2.G = obj;
                return k7hVar2;
            case 5:
                return new k7h((lf9) this.G, (List) obj2, tp4Var, 5);
            case 6:
                k7h k7hVar3 = new k7h((fti) obj2, tp4Var, 6);
                k7hVar3.G = obj;
                return k7hVar3;
            case 7:
                return new k7h((m1j) this.G, (uwc) obj2, tp4Var, 7);
            case 8:
                return new k7h(obj2, (String) this.G, tp4Var, 8);
            case 9:
                return new k7h((u4j) this.G, (PlaybackPace) obj2, tp4Var, 9);
            case 10:
                return new k7h((w4j) this.G, (PlaybackPace) obj2, tp4Var, 10);
            case 11:
                return new k7h(obj2, (String) this.G, tp4Var, 11);
            case 12:
                return new k7h((saj) this.G, (WiggleArtifactIdentifier) obj2, tp4Var, 12);
            default:
                k7h k7hVar4 = new k7h((qkj) obj2, tp4Var, 13);
                k7hVar4.G = obj;
                return k7hVar4;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 4:
                return ((k7h) create(obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 5:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 9:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 10:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 11:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 12:
                return ((k7h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((k7h) create((e8d) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        pqe pqeVarF;
        rqe rqeVar;
        ctk jq0Var;
        int i = this.E;
        int i2 = 4;
        int i3 = 2;
        int i4 = 0;
        Object obj2 = iei.a;
        Object obj3 = this.H;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        int i5 = 1;
        switch (i) {
            case 0:
                int i6 = this.F;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sf5.h0(obj);
                        return obj2;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                String str = (String) this.G;
                if (str == null) {
                    return obj2;
                }
                kah kahVar = (kah) ((nfb) obj3).i;
                this.F = 1;
                return ((uah) kahVar).f(str, this) == m45Var ? m45Var : obj2;
            case 1:
                vfh vfhVar = (vfh) obj3;
                int i7 = this.F;
                if (i7 != 0) {
                    if (i7 == 1 || i7 == 2 || i7 == 3) {
                        sf5.h0(obj);
                        return obj2;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                switch (((oo9) this.G).ordinal()) {
                    case g.MAX_FIELD_NUMBER /* 17 */:
                        sih sihVar = vfhVar.W;
                        this.F = 1;
                        sihVar.j(false, this);
                        if (obj2 != m45Var) {
                            return obj2;
                        }
                        break;
                    case g.AVG_FIELD_NUMBER /* 18 */:
                        sih sihVar2 = vfhVar.W;
                        this.F = 3;
                        if (sihVar2.y(this) != m45Var) {
                            return obj2;
                        }
                        break;
                    case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        sih sihVar3 = vfhVar.W;
                        this.F = 2;
                        sihVar3.k(this);
                        if (obj2 != m45Var) {
                            return obj2;
                        }
                        break;
                    default:
                        return obj2;
                }
                return m45Var;
            case 2:
                l45 l45Var = (l45) this.G;
                int i8 = this.F;
                try {
                    if (i8 == 0) {
                        sf5.h0(obj);
                        this.G = l45Var;
                        this.F = 1;
                        if (((j8i) obj3).f(this) == m45Var) {
                            obj2 = m45Var;
                        }
                    } else {
                        if (i8 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sf5.h0(obj);
                    }
                    return obj2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    zfa.a.getClass();
                    if (!yfa.b()) {
                        return obj2;
                    }
                    String strE = iuj.E(l45Var);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj4)).getClass();
                        arrayList.add(obj4);
                    }
                    if (arrayList.isEmpty()) {
                        return obj2;
                    }
                    String strQ = sq6.q(zfa.a, e2, "Reattest heal probe threw (degrading to no-op): ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.WARN, strE, strQ);
                    }
                    return obj2;
                }
            case 3:
                int i9 = this.F;
                if (i9 != 0) {
                    if (i9 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                j8i j8iVar = (j8i) obj3;
                ptf ptfVar = j8iVar.b;
                String str2 = (String) this.G;
                long jA = j8iVar.j.a() / 1000;
                byte[] bArrK = j8iVar.d.k(z5e.a(jA, "GET", "api/auth/session_reattest/device_key/challenge"));
                Map<String, String> mapC = bArrK == null ? nm6.E : z5e.c(str2, jA, bArrK);
                this.F = 1;
                Object objA = ptfVar.a(mapC, this);
                return objA == m45Var ? m45Var : objA;
            case 4:
                Object obj5 = this.G;
                int i10 = this.F;
                if (i10 == 0) {
                    sf5.h0(obj);
                    this.G = null;
                    this.F = 1;
                    return ((lp7) obj3).g(obj5, this) == m45Var ? m45Var : obj2;
                }
                if (i10 == 1) {
                    sf5.h0(obj);
                    return obj2;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                int i11 = this.F;
                if (i11 == 0) {
                    sf5.h0(obj);
                    lf9 lf9Var = (lf9) this.G;
                    this.F = 1;
                    if (lf9Var.n(this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i11 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                Iterator it2 = ((List) obj3).iterator();
                while (it2.hasNext()) {
                    try {
                        ((zy7) it2.next()).a();
                    } catch (Throwable unused) {
                    }
                }
                return obj2;
            case 6:
                fti ftiVar = (fti) obj3;
                l45 l45Var2 = (l45) this.G;
                int i12 = this.F;
                if (i12 == 0) {
                    sf5.h0(obj);
                    b3f b3fVarD0 = mpk.d0(new eti(ftiVar, 1));
                    bj bjVar = new bj(i3, null, 10);
                    this.G = l45Var2;
                    this.F = 1;
                    objJ = j8.J(b3fVarD0, bjVar, this);
                    if (objJ == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i12 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    objJ = obj;
                }
                if (((String) objJ) != null) {
                    gb9.D(ftiVar.a, null, null, new v2h(ftiVar, null, 9), 3);
                    return obj2;
                }
                zfa.a.getClass();
                if (!yfa.b()) {
                    return obj2;
                }
                String strE2 = iuj.E(l45Var2);
                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : copyOnWriteArrayList2) {
                    ((n30) ((zfa) obj6)).getClass();
                    arrayList2.add(obj6);
                }
                if (arrayList2.isEmpty()) {
                    return obj2;
                }
                zfa.a.getClass();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((n30) ((zfa) it3.next())).b(sfa.ERROR, strE2, "Failed to auto-submit phone code.");
                }
                return obj2;
            case 7:
                int i13 = this.F;
                if (i13 != 0) {
                    if (i13 == 1) {
                        sf5.h0(obj);
                        return obj2;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                f9 f9Var = ((m1j) this.G).c;
                VillageWeaverConsentState villageWeaverConsentState = ((uwc) obj3).E;
                this.F = 1;
                return f9Var.j(villageWeaverConsentState, this) == m45Var ? m45Var : obj2;
            case 8:
                int i14 = this.F;
                if (i14 != 0) {
                    if (i14 == 1) {
                        sf5.h0(obj);
                        return obj2;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                f9 f9Var2 = ((u4j) obj3).b;
                String str3 = (String) this.G;
                this.F = 1;
                return f9Var2.l(str3, this) == m45Var ? m45Var : obj2;
            case 9:
                int i15 = this.F;
                if (i15 != 0) {
                    if (i15 == 1) {
                        sf5.h0(obj);
                        return obj2;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                f9 f9Var3 = ((u4j) this.G).b;
                double speedFactor = ((PlaybackPace) obj3).getSpeedFactor();
                this.F = 1;
                return f9Var3.m(speedFactor, this) == m45Var ? m45Var : obj2;
            case 10:
                int i16 = this.F;
                if (i16 != 0) {
                    if (i16 == 1) {
                        sf5.h0(obj);
                        return obj2;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                f9 f9Var4 = ((w4j) this.G).d;
                double speedFactor2 = ((PlaybackPace) obj3).getSpeedFactor();
                this.F = 1;
                return f9Var4.m(speedFactor2, this) == m45Var ? m45Var : obj2;
            case 11:
                int i17 = this.F;
                if (i17 != 0) {
                    if (i17 == 1) {
                        sf5.h0(obj);
                        return obj2;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                f9 f9Var5 = ((w4j) obj3).d;
                String str4 = (String) this.G;
                this.F = 1;
                return f9Var5.l(str4, this) == m45Var ? m45Var : obj2;
            case 12:
                saj sajVar = (saj) this.G;
                WiggleArtifactIdentifier wiggleArtifactIdentifier = (WiggleArtifactIdentifier) obj3;
                int i18 = this.F;
                if (i18 == 0) {
                    sf5.h0(obj);
                    mdg mdgVar = sajVar.e;
                    pdg pdgVar = sajVar.g;
                    pdg pdgVar2 = sajVar.f;
                    tp0 tp0Var = (tp0) mdgVar.get(wiggleArtifactIdentifier);
                    if (tp0Var != null) {
                        return tp0Var;
                    }
                    if (!pdgVar2.contains(wiggleArtifactIdentifier)) {
                        pdgVar2.add(wiggleArtifactIdentifier);
                        pdgVar.remove(wiggleArtifactIdentifier);
                        jie jieVar = new jie();
                        String strA = sajVar.c.a();
                        String str5 = sajVar.a;
                        String strM542getChatIdRjYBDck = wiggleArtifactIdentifier.m542getChatIdRjYBDck();
                        String encodedPath = wiggleArtifactIdentifier.getEncodedPath();
                        str5.getClass();
                        strM542getChatIdRjYBDck.getClass();
                        encodedPath.getClass();
                        StringBuilder sbR = kgh.r("/api/organizations/", str5, "/conversations/", strM542getChatIdRjYBDck, "/wiggle/download-file?path=");
                        sbR.append(encodedPath);
                        jieVar.g(strA + sbR.toString());
                        kie kieVar = new kie(jieVar);
                        ArtifactType artifactTypeB = saj.b(wiggleArtifactIdentifier.getEncodedPath());
                        String strE1 = bsg.e1(wiggleArtifactIdentifier.getEncodedPath(), ".", "unknown");
                        try {
                            pqeVarF = new f4e((hdc) sajVar.b.a(), kieVar, false).f();
                            rqeVar = pqeVarF.K;
                            try {
                            } finally {
                            }
                        } catch (Exception e3) {
                            if (r0c.b(e3)) {
                                List list = xah.a;
                                xah.e(4, ij0.k("Network error fetching artifact (extension: ", strE1, "): ", e3.getMessage()), "network", null);
                            } else {
                                SilentException.a(new SilentException(ij0.k("Error fetching artifact (extension: ", strE1, "): ", e3.getMessage()), e3), null, false, 3);
                            }
                            pdgVar2.remove(wiggleArtifactIdentifier);
                            pdgVar.add(wiggleArtifactIdentifier);
                        }
                        if (pqeVarF.U) {
                            if (artifactTypeB instanceof ArtifactType.BinaryDocument) {
                                ByteString byteString = ByteString.H;
                                jq0Var = new iq0(ByteString.Companion.c(rqeVar.c()));
                            } else {
                                jq0Var = new jq0(rqeVar.f());
                            }
                            pqeVarF.close();
                            pdgVar2.remove(wiggleArtifactIdentifier);
                            tp0 tp0VarA = sajVar.a(wiggleArtifactIdentifier.getEncodedPath(), jq0Var, artifactTypeB, true);
                            sajVar.e.put(wiggleArtifactIdentifier, tp0VarA);
                            return tp0VarA;
                        }
                        List list2 = xah.a;
                        xah.e(4, "Failed to fetch artifact (HTTP " + pqeVarF.H + "), extension: " + strE1, "network", null);
                        pdgVar2.remove(wiggleArtifactIdentifier);
                        pdgVar.add(wiggleArtifactIdentifier);
                        pqeVarF.close();
                        return null;
                    }
                    b3f b3fVarD02 = mpk.d0(new ytf(sajVar, 26, wiggleArtifactIdentifier));
                    zl2 zl2Var = new zl2(i3, tp4Var, 18);
                    this.F = 1;
                    if (j8.H(b3fVarD02, zl2Var, this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i18 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return sajVar.e.get(wiggleArtifactIdentifier);
            default:
                int i19 = this.F;
                if (i19 != 0) {
                    if (i19 == 1) {
                        sf5.h0(obj);
                        return obj2;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                e8d e8dVar = (e8d) this.G;
                qkj qkjVar = (qkj) obj3;
                bz7 bz7Var = qkjVar.Y;
                boolean z = qkjVar.W;
                r10 r10Var = new r10(i2, qkjVar);
                o9d o9dVar = new o9d(i5, qkjVar);
                pkj pkjVar = new pkj(qkjVar, i4);
                pkj pkjVar2 = new pkj(qkjVar, i5);
                nkj nkjVar = new nkj(qkjVar, i5);
                this.F = 1;
                Object objF = pok.f(e8dVar, new lkj(pkjVar, bz7Var, nkjVar, pkjVar2, r10Var, o9dVar, z, null), this);
                if (objF != m45Var) {
                    objF = obj2;
                }
                return objF == m45Var ? m45Var : obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7h(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7h(Object obj, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.G = str;
    }
}
