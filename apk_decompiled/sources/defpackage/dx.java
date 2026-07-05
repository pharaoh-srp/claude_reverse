package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.common.ConsistencyLevel;
import com.anthropic.claude.chat.input.draft.DraftMessage;
import com.anthropic.claude.db.ClaudeDatabase;
import com.segment.analytics.kotlin.core.BaseEvent;
import java.util.Collection;
import java.util.List;
import kotlinx.serialization.json.JsonObject;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class dx extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(tp4 tp4Var, bz7 bz7Var, cve cveVar) {
        super(2, tp4Var);
        this.E = 17;
        this.G = cveVar;
        this.H = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                return new dx((gx) this.G, (JsonObject) obj2, tp4Var, 0);
            case 1:
                return new dx((BaseEvent) obj2, (gx) this.G, tp4Var);
            case 2:
                dx dxVar = new dx((k40) obj2, tp4Var, 2);
                dxVar.G = obj;
                return dxVar;
            case 3:
                return new dx((i5i) this.G, (eb1) obj2, tp4Var, 3);
            case 4:
                return new dx((jwb) this.G, (eb1) obj2, tp4Var, 4);
            case 5:
                return new dx((tl0) this.G, (String) obj2, tp4Var, 5);
            case 6:
                return new dx((ux1) this.G, (ka1) obj2, tp4Var, 6);
            case 7:
                return new dx((w79) this.G, (kdg) obj2, tp4Var, 7);
            case 8:
                dx dxVar2 = new dx((lh2) obj2, tp4Var, 8);
                dxVar2.G = obj;
                return dxVar2;
            case 9:
                dx dxVar3 = new dx((hw2) obj2, tp4Var, 9);
                dxVar3.G = obj;
                return dxVar3;
            case 10:
                dx dxVar4 = new dx((f03) obj2, tp4Var, 10);
                dxVar4.G = obj;
                return dxVar4;
            case 11:
                dx dxVar5 = new dx((er7) obj2, tp4Var, 11);
                dxVar5.G = obj;
                return dxVar5;
            case 12:
                dx dxVar6 = new dx((el3) obj2, tp4Var, 12);
                dxVar6.G = obj;
                return dxVar6;
            case 13:
                return new dx((pz7) this.G, (dae) obj2, tp4Var, 13);
            case 14:
                return new dx((nwb) this.G, (hi4) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new dx((m4a) this.G, (hi4) obj2, tp4Var, 15);
            case 16:
                return new dx((lf9) this.G, (pd5) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new dx(tp4Var, (bz7) obj2, (cve) this.G);
            case g.AVG_FIELD_NUMBER /* 18 */:
                dx dxVar7 = new dx(tp4Var, (bz7) obj2);
                dxVar7.G = obj;
                return dxVar7;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                dx dxVar8 = new dx((List) obj2, tp4Var, 19);
                dxVar8.G = obj;
                return dxVar8;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new dx((bi5) this.G, (crd) null, (el5) obj2, tp4Var);
            case 21:
                return new dx((bi5) this.G, (keb) obj2, (crd) null, tp4Var);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                dx dxVar9 = new dx((bi5) obj2, tp4Var, 22);
                dxVar9.G = obj;
                return dxVar9;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                dx dxVar10 = new dx((Collection) obj2, tp4Var, 23);
                dxVar10.G = obj;
                return dxVar10;
            case 24:
                return new dx((sa6) this.G, (mkf) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                dx dxVar11 = new dx((nwb) obj2, tp4Var, 25);
                dxVar11.G = obj;
                return dxVar11;
            case 26:
                dx dxVar12 = new dx((kp7) obj2, tp4Var, 26);
                dxVar12.G = obj;
                return dxVar12;
            case 27:
                return new dx((xne) this.G, (ou7) obj2, tp4Var, 27);
            case 28:
                return new dx((ba4) this.G, (mg8) obj2, tp4Var, 28);
            default:
                return new dx((yn8) this.G, (ConsistencyLevel) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                ((dx) create((j49) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            case 3:
                ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            case 4:
                ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            case 5:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                return ((dx) create((aid) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 9:
                return ((dx) create((DraftMessage) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 10:
                return ((dx) create((String) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 11:
                return ((dx) create((lp7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 12:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 13:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 14:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 16:
                ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ((dx) create((guc) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((dx) create((gh5) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 21:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((dx) create((keb) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((dx) create((ClaudeDatabase) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 24:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case BuildConfig.VERSION_CODE /* 25 */:
                return ((dx) create((uf6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 26:
                return ((dx) create((aid) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 27:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 28:
                ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            default:
                return ((dx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:456:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x039c -> B:219:0x039f). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(tp4 tp4Var, bz7 bz7Var) {
        super(2, tp4Var);
        this.E = 18;
        this.H = bz7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(bi5 bi5Var, keb kebVar, crd crdVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 21;
        this.G = bi5Var;
        this.H = kebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(bi5 bi5Var, crd crdVar, el5 el5Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 20;
        this.G = bi5Var;
        this.H = el5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(BaseEvent baseEvent, gx gxVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 1;
        this.H = baseEvent;
        this.G = gxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dx(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dx(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
    }
}
