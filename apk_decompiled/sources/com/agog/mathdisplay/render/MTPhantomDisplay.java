package com.agog.mathdisplay.render;

import com.agog.mathdisplay.parse.NSRange;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/agog/mathdisplay/render/MTPhantomDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "range", "Lcom/agog/mathdisplay/parse/NSRange;", "<init>", "(Lcom/agog/mathdisplay/parse/NSRange;)V", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTPhantomDisplay extends MTDisplay {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTPhantomDisplay(NSRange nSRange) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nSRange, false, 23, null);
        nSRange.getClass();
    }
}
