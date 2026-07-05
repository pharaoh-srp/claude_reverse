package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hc0 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Map G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc0(int i, Map map) {
        super(0);
        this.F = i;
        this.G = map;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        Map map = this.G;
        switch (i) {
            case 0:
                int iHashCode = 0;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode);
            default:
                return String.format(Locale.US, "RUM feature received an event with unknown value of \"type\" property=%s.", Arrays.copyOf(new Object[]{map.get("type")}, 1));
        }
    }
}
