package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.account.VillageWeaverConsentState;
import com.anthropic.claude.api.chat.CreateChatRequest;
import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.api.chat.UpdateChatModelFallbackResponse;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class nn1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ Object G;
    public Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn1(tn1 tn1Var, Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = tn1Var;
        this.H = obj;
    }

    private final Object d(Object obj) {
        cpc cpcVar;
        VillageWeaverConsentState villageWeaverConsentState = (VillageWeaverConsentState) this.G;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            f9 f9Var = (f9) this.H;
            this.F = 1;
            obj = f9Var.j(villageWeaverConsentState, this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (!(apiResult instanceof of0)) {
            if (!(apiResult instanceof nf0)) {
                wg6.i();
                return null;
            }
            nf0 nf0Var = (nf0) apiResult;
            if (nf0Var instanceof lf0) {
                cpcVar = new cpc(grc.p(((lf0) nf0Var).a, "http "), null);
            } else {
                if (!(nf0Var instanceof mf0)) {
                    wg6.i();
                    return null;
                }
                Throwable th = ((mf0) nf0Var).a;
                cpcVar = new cpc(jce.a.b(th.getClass()).f(), th);
            }
            String str = (String) cpcVar.E;
            SilentException.a(new SilentException("voice-consent upsell write failed: " + villageWeaverConsentState + " " + str, (Throwable) cpcVar.F), ozf.F, false, 2);
        }
        return iei.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (defpackage.db3.P(r0, r8) == r6) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn1.n(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return new nn1((jm1) this.H, (tn1) obj2, tp4Var, 0);
            case 1:
                return new nn1((tn1) obj2, tp4Var, 1);
            case 2:
                nn1 nn1Var = new nn1((tn1) obj2, tp4Var, 2);
                nn1Var.H = obj;
                return nn1Var;
            case 3:
                return new nn1((tn1) obj2, this.H, tp4Var, 3);
            case 4:
                return new nn1((tn1) obj2, this.H, tp4Var, 4);
            case 5:
                return new nn1((nx1) this.H, (l9e) obj2, tp4Var, 5);
            case 6:
                return new nn1((hdc) this.H, (String) obj2, tp4Var, 6);
            case 7:
                return new nn1((qb2) this.H, (String) obj2, tp4Var, 7);
            case 8:
                return new nn1((dui) this.H, (nwb) obj2, tp4Var, 8);
            case 9:
                return new nn1((eui) this.H, (dui) obj2, tp4Var, 9);
            case 10:
                return new nn1((od2) this.H, (lj2) obj2, tp4Var, 10);
            case 11:
                return new nn1((rz7) this.H, (gri) obj2, tp4Var, 11);
            case 12:
                nn1 nn1Var2 = new nn1((oh2) obj2, tp4Var, 12);
                nn1Var2.H = obj;
                return nn1Var2;
            case 13:
                return new nn1((kp7) this.H, (bmf) obj2, tp4Var, 13);
            case 14:
                return new nn1((em2) this.H, (n78) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new nn1((List) this.H, (isc) obj2, tp4Var, 15);
            case 16:
                return new nn1((hw2) this.H, (gt2) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new nn1((hw2) this.H, (sw2) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                nn1 nn1Var3 = new nn1((t53) obj2, tp4Var, 18);
                nn1Var3.H = obj;
                return nn1Var3;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new nn1((t53) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new nn1((t53) obj2, tp4Var, 20);
            case 21:
                return new nn1((t53) this.H, (cae) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new nn1((t53) this.H, (UpdateChatModelFallbackResponse) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new nn1((t53) this.H, (ModelSelection) obj2, tp4Var, 23);
            case 24:
                return new nn1((t53) this.H, (CreateChatRequest) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new nn1((t53) this.H, (xc3) obj2, tp4Var, 25);
            case 26:
                return new nn1((t53) obj2, tp4Var, 26);
            case 27:
                return new nn1((f9) this.H, (VillageWeaverConsentState) obj2, tp4Var, 27);
            case 28:
                return new nn1((db3) obj2, tp4Var, 28);
            default:
                return new nn1((xc3) this.H, (dae) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 8:
                ((nn1) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 9:
                ((nn1) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((nn1) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((nn1) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:279:0x063c  */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:278:0x063a -> B:281:0x063e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn1(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn1(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.G = obj2;
    }
}
