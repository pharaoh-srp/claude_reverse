package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes.dex */
public final class cj2 {
    public final InputStream a;
    public final CharsetDecoder b;
    public final ByteBuffer c;
    public boolean d;
    public char e;

    public cj2(InputStream inputStream, Charset charset) {
        inputStream.getClass();
        charset.getClass();
        this.a = inputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        charsetDecoderOnUnmappableCharacter.getClass();
        this.b = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(n12.c.c(8196));
        byteBufferWrap.getClass();
        this.c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d3, code lost:
    
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(char[] r11, int r12, int r13) throws java.nio.charset.CharacterCodingException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj2.a(char[], int, int):int");
    }
}
