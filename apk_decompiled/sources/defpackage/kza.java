package defpackage;

import android.net.Uri;
import android.view.textclassifier.TextClassifier;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.notification.TrackPushOpenRequest;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class kza extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ Object G;
    public Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kza(vza vzaVar, rz7 rz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 1;
        this.G = vzaVar;
        this.H = rz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                kza kzaVar = new kza((vza) obj2, tp4Var, 0);
                kzaVar.H = obj;
                return kzaVar;
            case 1:
                return new kza((vza) obj2, (rz7) this.H, tp4Var);
            case 2:
                return new kza((u5b) this.H, (Uri) obj2, tp4Var, 2);
            case 3:
                kza kzaVar2 = new kza((lbb) obj2, tp4Var, 3);
                kzaVar2.H = obj;
                return kzaVar2;
            case 4:
                kza kzaVar3 = new kza((isb) obj2, tp4Var, 4);
                kzaVar3.H = obj;
                return kzaVar3;
            case 5:
                kza kzaVar4 = new kza((x0c) obj2, tp4Var, 5);
                kzaVar4.H = obj;
                return kzaVar4;
            case 6:
                return new kza((l1c) this.H, (aid) obj2, tp4Var, 6);
            case 7:
                return new kza((u3c) this.H, (wlg) obj2, tp4Var, 7);
            case 8:
                return new kza((u3c) this.H, (String) obj2, tp4Var, 8);
            case 9:
                return new kza((i6c) this.H, (pz7) obj2, tp4Var, 9);
            case 10:
                kza kzaVar5 = new kza((c9c) obj2, tp4Var, 10);
                kzaVar5.H = obj;
                return kzaVar5;
            case 11:
                return new kza((tec) this.H, (hya) obj2, tp4Var, 11);
            case 12:
                return new kza((vpc) this.H, (mpc) obj2, tp4Var, 12);
            case 13:
                return new kza((vpc) this.H, (t74) obj2, tp4Var, 13);
            case 14:
                return new kza((m4a) this.H, (dyc) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new kza((TextClassifier) this.H, (pz7) obj2, tp4Var, 15);
            case 16:
                return new kza((v77) this.H, (pz7) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new kza((edd) this.H, (v77) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new kza((w79) this.H, (nwb) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                kza kzaVar6 = new kza((e1a) obj2, tp4Var, 19);
                kzaVar6.H = obj;
                return kzaVar6;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new kza((ild) obj2, tp4Var, 20);
            case 21:
                return new kza((wmd) this.H, (zy1) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                kza kzaVar7 = new kza((qnd) obj2, tp4Var, 22);
                kzaVar7.H = obj;
                return kzaVar7;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new kza((lod) this.H, (String) obj2, tp4Var, 23);
            case 24:
                return new kza((wqd) this.H, (gnd) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new kza((bzd) this.H, (TrackPushOpenRequest) obj2, tp4Var, 25);
            case 26:
                kza kzaVar8 = new kza((kzd) obj2, tp4Var, 26);
                kzaVar8.H = obj;
                return kzaVar8;
            case 27:
                return new kza((kzd) this.H, (ybg) obj2, tp4Var, 27);
            case 28:
                return new kza((r4e) this.H, (jx8) obj2, tp4Var, 28);
            default:
                return new kza((s4e) this.H, (kx8) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 16:
                ((kza) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((kza) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:393:0x0746, code lost:
    
        if (r2 == r10) goto L394;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0661 A[Catch: all -> 0x063f, TryCatch #2 {all -> 0x063f, blocks: (B:345:0x063b, B:354:0x0657, B:356:0x0661, B:359:0x0671, B:351:0x064a), top: B:474:0x0631 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0692 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:490:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:360:0x068e -> B:354:0x0657). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kza.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kza(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kza(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.G = obj2;
    }
}
