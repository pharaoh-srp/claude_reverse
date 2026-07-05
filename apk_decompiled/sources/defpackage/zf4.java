package defpackage;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class zf4 {
    public static final BitSet a;
    public static final BitSet b;
    public static final BitSet c;
    public static final BitSet d;
    public static final LinkedHashSet e;

    static {
        BitSet bitSet = new BitSet();
        a = bitSet;
        bitSet.set(500, 600);
        BitSet bitSet2 = new BitSet();
        b = bitSet2;
        bitSet2.set(400, 500);
        BitSet bitSet3 = new BitSet();
        c = bitSet3;
        bitSet3.set(2, 17);
        BitSet bitSet4 = new BitSet();
        d = bitSet4;
        bitSet4.set(1, 17);
        new BitSet().set(0, 1);
        e = new LinkedHashSet(Arrays.asList(h3i.F, h3i.I));
        new HashSet(Arrays.asList("SHA1", "SHA-1", "MD2", "MD5", "RIPEMD128", "MD4"));
    }
}
