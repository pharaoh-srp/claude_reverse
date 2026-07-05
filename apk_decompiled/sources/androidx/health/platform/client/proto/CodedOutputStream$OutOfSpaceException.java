package androidx.health.platform.client.proto;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class CodedOutputStream$OutOfSpaceException extends IOException {
    public CodedOutputStream$OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }

    public CodedOutputStream$OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
