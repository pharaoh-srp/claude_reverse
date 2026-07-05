package defpackage;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes.dex */
public final class jr8 implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z || !x44.r(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new ic0(xMLReader.getContentHandler(), editable));
    }
}
