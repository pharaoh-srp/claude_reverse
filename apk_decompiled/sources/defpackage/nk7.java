package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class nk7 extends mpk {
    public static boolean l0(File file) {
        file.getClass();
        g96 g96Var = new g96(new uj7(file));
        while (true) {
            boolean z = true;
            while (g96Var.hasNext()) {
                File file2 = (File) g96Var.next();
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    public static String m0(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return bsg.d1('.', name, "");
    }

    public static String n0(File file) {
        String name = file.getName();
        name.getClass();
        int iL0 = bsg.L0(name, 6, ".");
        return iL0 == -1 ? name : name.substring(0, iL0);
    }

    public static byte[] o0(File file) throws IOException {
        file.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    zb7 zb7Var = new zb7();
                    zb7Var.write(i5);
                    zni.o(fileInputStream, zb7Var);
                    int size = zb7Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrC = zb7Var.c();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    mp0.q0(i, 0, zb7Var.size(), bArrC, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                wd6.Z(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String p0(File file, Charset charset) throws IOException {
        file.getClass();
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strG0 = d4c.g0(inputStreamReader);
            inputStreamReader.close();
            return strG0;
        } finally {
        }
    }

    public static File q0(File file, String str) {
        int iF0;
        file.getClass();
        File file2 = new File(str);
        String path = file2.getPath();
        path.getClass();
        char c = File.separatorChar;
        int length = 0;
        int iF02 = bsg.F0(path, c, 0, 4);
        if (iF02 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c || (iF0 = bsg.F0(path, c, 2, 4)) < 0) {
                length = 1;
            } else {
                int iF03 = bsg.F0(path, c, iF0 + 1, 4);
                length = iF03 >= 0 ? iF03 + 1 : path.length();
            }
        } else if (iF02 > 0 && path.charAt(iF02 - 1) == ':') {
            length = iF02 + 1;
        } else if (iF02 == -1 && bsg.z0(path, ':')) {
            length = path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        string.getClass();
        if (string.length() == 0 || bsg.z0(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }

    public static void r0(File file, String str, Charset charset) throws IOException {
        file.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            s0(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void s0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        charset.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(FreeTypeConstants.FT_LOAD_LINEAR_DESIGN * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                sz6.j("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
