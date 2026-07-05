package com.anthropic.claude.tool.model;

import com.anthropic.claude.api.chat.tool.GenericSourceMetadata;
import com.anthropic.claude.api.chat.tool.GoogleDocMetadata;
import com.anthropic.claude.api.chat.tool.SourceMetadata;
import com.anthropic.claude.api.chat.tool.UnknownSourceMetadata;
import com.anthropic.claude.api.chat.tool.WebpageMetadata;
import com.anthropic.claude.tool.model.SourceImage;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import defpackage.quk;
import defpackage.wg6;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public static SourceImage a(SourceMetadata sourceMetadata, String str) {
        if (sourceMetadata instanceof GoogleDocMetadata) {
            return SourceImage.GoogleDoc.INSTANCE;
        }
        if (sourceMetadata instanceof WebpageMetadata) {
            String favicon_url = ((WebpageMetadata) sourceMetadata).getFavicon_url();
            return favicon_url != null ? new SourceImage.Url(favicon_url, str) : new SourceImage.Text(quk.i(str));
        }
        if (!(sourceMetadata instanceof GenericSourceMetadata)) {
            if ((sourceMetadata instanceof UnknownSourceMetadata) || sourceMetadata == null) {
                return new SourceImage.Text(quk.i(str));
            }
            wg6.i();
            return null;
        }
        GenericSourceMetadata genericSourceMetadata = (GenericSourceMetadata) sourceMetadata;
        String icon_url = genericSourceMetadata.getIcon_url();
        if (icon_url == null) {
            return new SourceImage.Text(quk.i(str));
        }
        String source = genericSourceMetadata.getSource();
        if (source != null) {
            str = source;
        }
        return new SourceImage.Url(icon_url, str);
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.SourceImage", kceVar.b(SourceImage.class), new pl9[]{kceVar.b(SourceImage.GoogleDoc.class), kceVar.b(SourceImage.Text.class), kceVar.b(SourceImage.Url.class)}, new KSerializer[]{new lq6("com.anthropic.claude.tool.model.SourceImage.GoogleDoc", SourceImage.GoogleDoc.INSTANCE, new Annotation[0]), b.a, d.a}, new Annotation[0]);
    }
}
