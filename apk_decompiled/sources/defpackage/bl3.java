package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bl3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ wlg F;

    public /* synthetic */ bl3(wlg wlgVar, int i) {
        this.E = i;
        this.F = wlgVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        float fFloatValue = MTTypesetterKt.kLineSkipLimitMultiplier;
        wlg wlgVar = this.F;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) wlgVar.getValue();
                bool.getClass();
                return bool;
            case 1:
                return Boolean.valueOf((wlgVar != null ? ((Number) wlgVar.getValue()).floatValue() : 0.0f) > MTTypesetterKt.kLineSkipLimitMultiplier);
            case 2:
                return Boolean.valueOf((wlgVar != null ? ((Number) wlgVar.getValue()).floatValue() : 0.0f) > MTTypesetterKt.kLineSkipLimitMultiplier);
            case 3:
                return Float.valueOf(wlgVar != null ? ((Number) wlgVar.getValue()).floatValue() : 1.0f);
            case 4:
                if (wlgVar != null) {
                    fFloatValue = ((Number) wlgVar.getValue()).floatValue();
                }
                return Float.valueOf(fFloatValue);
            default:
                if (wlgVar != null) {
                    fFloatValue = ((Number) wlgVar.getValue()).floatValue();
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
