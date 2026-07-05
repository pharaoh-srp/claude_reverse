package defpackage;

import android.content.Context;
import androidx.compose.material3.internal.ripple.RippleNode;
import androidx.health.platform.client.proto.g;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class al8 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al8(lx9 lx9Var, int i, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 8;
        this.G = lx9Var;
        this.F = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = 2;
        switch (this.E) {
            case 0:
                return new al8((dl8) this.G, tp4Var, 0);
            case 1:
                return new al8((xm8) this.G, tp4Var, 1);
            case 2:
                return new al8((dv) this.G, tp4Var, i);
            case 3:
                return new al8((a09) this.G, tp4Var, 3);
            case 4:
                return new al8((w59) this.G, tp4Var, 4);
            case 5:
                return new al8((q79) this.G, tp4Var, 5);
            case 6:
                return new al8((ca9) this.G, tp4Var, 6);
            case 7:
                return new al8((md9) this.G, tp4Var, 7);
            case 8:
                return new al8((lx9) this.G, this.F, tp4Var);
            case 9:
                return new al8((q28) this.G, tp4Var, 9);
            case 10:
                return new al8((is5) this.G, tp4Var, 10);
            case 11:
                return new al8((rja) this.G, tp4Var, 11);
            case 12:
                al8 al8Var = new al8((zv5) this.G, tp4Var, 12);
                al8Var.F = ((Number) obj).intValue();
                return al8Var;
            case 13:
                return new al8((u5b) this.G, tp4Var, 13);
            case 14:
                return new al8((m6b) this.G, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new al8((zbb) this.G, tp4Var, 15);
            case 16:
                return new al8((isb) this.G, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new al8((Context) this.G, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new al8((nf6) this.G, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                al8 al8Var2 = new al8(i, tp4Var);
                al8Var2.G = obj;
                return al8Var2;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new al8((c9c) this.G, tp4Var, 20);
            case 21:
                return new al8((f6d) this.G, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new al8((s8a) this.G, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new al8((ydd) this.G, tp4Var, 23);
            case 24:
                return new al8((lxd) this.G, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new al8((che) this.G, tp4Var, 25);
            case 26:
                return new al8((xhe) this.G, tp4Var, 26);
            case 27:
                return new al8((oke) this.G, tp4Var, 27);
            case 28:
                return new al8((RippleNode) this.G, tp4Var, 28);
            default:
                return new al8((a0f) this.G, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 8:
                ((al8) create((h9f) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 12:
                break;
        }
        return ((al8) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x03e8, code lost:
    
        if (r1.b(r21, defpackage.sja.a) == r9) goto L211;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al8(int i, tp4 tp4Var) {
        super(i, tp4Var);
        this.E = 19;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al8(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
    }
}
