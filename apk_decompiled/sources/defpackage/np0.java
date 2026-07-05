package defpackage;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class np0 extends i2 implements RandomAccess {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ np0(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.E;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                if (!(obj instanceof Byte)) {
                    return false;
                }
                byte bByteValue = ((Number) obj).byteValue();
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                    } else if (bByteValue != bArr[i2]) {
                        i2++;
                    }
                }
                return i2 >= 0;
            default:
                if (obj instanceof Integer) {
                    return mp0.n0(((Number) obj).intValue(), (int[]) obj2);
                }
                return false;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.E;
        Object obj = this.F;
        switch (i2) {
            case 0:
                return Byte.valueOf(((byte[]) obj)[i]);
            default:
                return Integer.valueOf(((int[]) obj)[i]);
        }
    }

    @Override // defpackage.w0
    public final int getSize() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    @Override // defpackage.i2, java.util.List
    public final int indexOf(Object obj) {
        int i = this.E;
        int i2 = 0;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                if (obj instanceof Byte) {
                    byte bByteValue = ((Number) obj).byteValue();
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length;
                    while (i2 < length) {
                        if (bByteValue != bArr[i2]) {
                            i2++;
                        }
                        break;
                    }
                    break;
                }
                break;
            default:
                if (obj instanceof Integer) {
                    int iIntValue = ((Number) obj).intValue();
                    int[] iArr = (int[]) obj2;
                    int length2 = iArr.length;
                    while (i2 < length2) {
                        if (iIntValue != iArr[i2]) {
                            i2++;
                        }
                        break;
                    }
                    break;
                }
                break;
        }
        return i2;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                if (((byte[]) obj).length == 0) {
                }
                break;
            default:
                if (((int[]) obj).length == 0) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.i2, java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.E;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                if (obj instanceof Byte) {
                    byte bByteValue = ((Number) obj).byteValue();
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    if (length >= 0) {
                        while (true) {
                            int i2 = length - 1;
                            if (bByteValue != bArr[length]) {
                                if (i2 >= 0) {
                                    length = i2;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (obj instanceof Integer) {
                    int iIntValue = ((Number) obj).intValue();
                    int[] iArr = (int[]) obj2;
                    int length2 = iArr.length - 1;
                    if (length2 >= 0) {
                        while (true) {
                            int i3 = length2 - 1;
                            if (iIntValue != iArr[length2]) {
                                if (i3 >= 0) {
                                    length2 = i3;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return -1;
    }
}
