package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class q67 extends InputStream implements DataInput {
    public final DataInputStream E;
    public int F;
    public ByteOrder G;
    public byte[] H;
    public final int I;

    public q67(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.E = dataInputStream;
        dataInputStream.mark(0);
        this.F = 0;
        this.G = byteOrder;
        this.I = inputStream instanceof q67 ? ((q67) inputStream).I : -1;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.E.available();
    }

    public final void c(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.E;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.H == null) {
                    this.H = new byte[FreeTypeConstants.FT_LOAD_LINEAR_DESIGN];
                }
                iSkip = dataInputStream.read(this.H, 0, Math.min(FreeTypeConstants.FT_LOAD_LINEAR_DESIGN, i3));
                if (iSkip == -1) {
                    throw new EOFException(grc.u("Reached EOF while skipping ", i, " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.F += i2;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.F++;
        return this.E.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.F++;
        return this.E.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.F++;
        int i = this.E.read();
        if (i >= 0) {
            return (byte) i;
        }
        sz6.n();
        return (byte) 0;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.F += 2;
        return this.E.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.F += bArr.length;
        this.E.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.F += 4;
        DataInputStream dataInputStream = this.E;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            sz6.n();
            return 0;
        }
        ByteOrder byteOrder = this.G;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        e0.e("Invalid byte order: ", this.G);
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.F += 8;
        DataInputStream dataInputStream = this.E;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            sz6.n();
            return 0L;
        }
        ByteOrder byteOrder = this.G;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
        }
        e0.e("Invalid byte order: ", this.G);
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.F += 2;
        DataInputStream dataInputStream = this.E;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            sz6.n();
            return (short) 0;
        }
        ByteOrder byteOrder = this.G;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i2);
        }
        e0.e("Invalid byte order: ", this.G);
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.F += 2;
        return this.E.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.F++;
        return this.E.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.F += 2;
        DataInputStream dataInputStream = this.E;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            sz6.n();
            return 0;
        }
        ByteOrder byteOrder = this.G;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 8) + i2;
        }
        e0.e("Invalid byte order: ", this.G);
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.F += i2;
        this.E.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.E.read(bArr, i, i2);
        this.F += i3;
        return i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q67(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public q67(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.I = bArr.length;
    }
}
