package com.agog.mathdisplay;

import android.content.Context;
import android.content.res.AssetManager;
import com.agog.mathdisplay.parse.MathDisplayException;
import com.agog.mathdisplay.render.MTFont;
import defpackage.mdj;
import defpackage.mq5;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/agog/mathdisplay/MTFontManager;", "", "<init>", "()V", "Companion", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTFontManager {
    private static AssetManager assets;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HashMap<String, MTFont> nameToFontMap = new HashMap<>();

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0017j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/agog/mathdisplay/MTFontManager$Companion;", "", "<init>", "()V", "", "name", "", "size", "Lcom/agog/mathdisplay/render/MTFont;", "fontWithName", "(Ljava/lang/String;F)Lcom/agog/mathdisplay/render/MTFont;", "Landroid/content/Context;", "context", "Liei;", "setContext", "(Landroid/content/Context;)V", "latinModernFontWithSize", "(F)Lcom/agog/mathdisplay/render/MTFont;", "defaultFont", "()Lcom/agog/mathdisplay/render/MTFont;", "Landroid/content/res/AssetManager;", "assets", "Landroid/content/res/AssetManager;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nameToFontMap", "Ljava/util/HashMap;", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final MTFont defaultFont() {
            return latinModernFontWithSize(20.0f);
        }

        public final MTFont fontWithName(String name, float size) throws MathDisplayException {
            name.getClass();
            MTFont mTFont = (MTFont) MTFontManager.nameToFontMap.get(name);
            if (mTFont != null) {
                return mTFont.getFontSize() == size ? mTFont : mTFont.copyFontWithSize(size);
            }
            AssetManager assetManager = MTFontManager.assets;
            if (assetManager == null) {
                throw new MathDisplayException("MTFontManager assets is null");
            }
            MTFont mTFont2 = new MTFont(assetManager, name, size, false, 8, null);
            MTFontManager.nameToFontMap.put(name, mTFont2);
            return mTFont2;
        }

        public final MTFont latinModernFontWithSize(float size) {
            return fontWithName("latinmodern-math", size);
        }

        public final void setContext(Context context) {
            context.getClass();
            MTFontManager.assets = context.getAssets();
        }

        private Companion() {
        }
    }
}
