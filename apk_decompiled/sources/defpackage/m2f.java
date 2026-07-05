package defpackage;

import com.caverock.androidsvg.SVGParseException;
import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;

/* JADX INFO: loaded from: classes3.dex */
public final class m2f extends DefaultHandler2 {
    public final /* synthetic */ q2f a;

    public m2f(q2f q2fVar) {
        this.a = q2fVar;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.a.F(new String(cArr, i, i2));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.a.c(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        q2f.y(new bi0(str2));
        str.equals("xml-stylesheet");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.a.D();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        this.a.E(str, str2, str3, attributes);
    }
}
