package defpackage;

import com.anthropic.claude.tool.model.ChartDisplayV0InputStyle;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class oj2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChartDisplayV0InputStyle.values().length];
        try {
            iArr[ChartDisplayV0InputStyle.LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChartDisplayV0InputStyle.BAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChartDisplayV0InputStyle.SCATTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
