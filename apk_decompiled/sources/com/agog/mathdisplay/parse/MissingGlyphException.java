package com.agog.mathdisplay.parse;

import defpackage.grc;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/agog/mathdisplay/parse/MissingGlyphException;", "Lcom/agog/mathdisplay/parse/MathDisplayException;", "glyphSlot", "", "<init>", "(I)V", "getGlyphSlot", "()I", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MissingGlyphException extends MathDisplayException {
    private final int glyphSlot;

    public MissingGlyphException(int i) {
        super(grc.u("missing glyph slot ", i, "."));
        this.glyphSlot = i;
    }

    public final int getGlyphSlot() {
        return this.glyphSlot;
    }
}
