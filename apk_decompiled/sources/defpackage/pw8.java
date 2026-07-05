package defpackage;

import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pw8 implements lp7 {
    public final /* synthetic */ gw8 E;
    public final /* synthetic */ List F;
    public final /* synthetic */ int G;

    public pw8(gw8 gw8Var, List list, int i) {
        this.E = gw8Var;
        this.F = list;
        this.G = i;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        ImageGalleryItem imageGalleryItem = (ImageGalleryItem) w44.O0(((Number) obj).intValue(), this.F);
        String strM303getIdivCCbqw = imageGalleryItem != null ? imageGalleryItem.m303getIdivCCbqw() : null;
        int i = this.G;
        gw8 gw8Var = this.E;
        if (i == gw8Var.f) {
            gw8Var.b.setValue(strM303getIdivCCbqw != null ? ImageGalleryItemId.m304boximpl(strM303getIdivCCbqw) : null);
        }
        return iei.a;
    }
}
