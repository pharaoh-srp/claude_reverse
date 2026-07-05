package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes2.dex */
public final class bw implements zy7 {
    public static final bw F = new bw(0);
    public static final bw G = new bw(1);
    public static final bw H = new bw(2);
    public static final bw I = new bw(3);
    public static final bw J = new bw(4);
    public static final bw K = new bw(5);
    public static final bw L = new bw(6);
    public final /* synthetic */ int E;

    public /* synthetic */ bw(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ieiVar;
            case 1:
                throw new IllegalStateException("Segment Analytics is unavailable in previews");
            case 2:
                throw new IllegalStateException("FirebaseAnalytics is unavailable in previews");
            case 3:
                return mpk.P(Boolean.FALSE);
            case 4:
                return "There is more input to consume";
            case 5:
                return new d54(d54.b);
            case 6:
                return ieiVar;
            case 7:
                return ((m7f) gb9.y().c.I).a(jce.a.b(qi3.class), null, null);
            case 8:
                return x44.W(CodeRemoteBottomSheetDestination.Closed.a);
            case 9:
                return new ka2(new CameraPosition(new LatLng(0.0d, 0.0d), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier));
            case 10:
                return ((m7f) gb9.y().c.I).a(jce.a.b(h86.class), null, null);
            case 11:
                return ((m7f) gb9.y().c.I).a(jce.a.b(um1.class), null, null);
            case 12:
                return ((m7f) gb9.y().c.I).a(jce.a.b(ze0.class), null, null);
            default:
                return ((m7f) gb9.y().c.I).a(jce.a.b(qi3.class), null, null);
        }
    }

    public /* synthetic */ bw(hr9 hr9Var, int i) {
        this.E = i;
    }
}
