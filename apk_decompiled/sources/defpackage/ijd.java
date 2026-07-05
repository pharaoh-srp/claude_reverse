package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class ijd extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ijd(int i, Object obj) {
        super(0);
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        Object obj = this.G;
        switch (i) {
            case 0:
                return String.format(Locale.US, "Profiling feature received an event of unsupported type=%s.", Arrays.copyOf(new Object[]{obj.getClass().getCanonicalName()}, 1));
            case 1:
                return String.format(Locale.US, "RumEventMapper: there was no EventMapper assigned for RUM event type: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
            case 2:
                return String.format(Locale.US, "RumEventMapper: the returned mapped ViewEvent was null. The original event object will be used instead: %s", Arrays.copyOf(new Object[]{obj}, 1));
            case 3:
                return String.format(Locale.US, "RumEventMapper: the returned mapped object was null. This event will be dropped: %s", Arrays.copyOf(new Object[]{obj}, 1));
            case 4:
                return String.format(Locale.US, "RumEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s", Arrays.copyOf(new Object[]{obj}, 1));
            case 5:
                return String.format(Locale.US, "RUM feature receive an event of unsupported type=%s.", Arrays.copyOf(new Object[]{obj.getClass().getCanonicalName()}, 1));
            default:
                return String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
        }
    }
}
