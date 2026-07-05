package com.agog.mathdisplay.parse;

import defpackage.ij0;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathColorbox;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "innerList", "Lcom/agog/mathdisplay/parse/MTMathList;", "getInnerList", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setInnerList", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "colorString", "", "getColorString", "()Ljava/lang/String;", "setColorString", "(Ljava/lang/String;)V", "toLatexString", "copyDeep", "finalized", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTMathColorbox extends MTMathAtom {
    private String colorString;
    private MTMathList innerList;

    public MTMathColorbox() {
        super(MTMathAtomType.KMTMathAtomColorbox, "");
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTMathColorbox copyDeep() throws MathDisplayException {
        MTMathColorbox mTMathColorbox = new MTMathColorbox();
        copyDeepContent(mTMathColorbox);
        MTMathList mTMathList = this.innerList;
        mTMathColorbox.innerList = mTMathList != null ? mTMathList.copyDeep() : null;
        mTMathColorbox.colorString = this.colorString;
        return mTMathColorbox;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTMathColorbox finalized() throws MathDisplayException {
        MTMathColorbox mTMathColorboxCopyDeep = copyDeep();
        finalized(mTMathColorboxCopyDeep);
        MTMathList mTMathList = mTMathColorboxCopyDeep.innerList;
        mTMathColorboxCopyDeep.innerList = mTMathList != null ? mTMathList.finalized() : null;
        return mTMathColorboxCopyDeep;
    }

    public final String getColorString() {
        return this.colorString;
    }

    public final MTMathList getInnerList() {
        return this.innerList;
    }

    public final void setColorString(String str) {
        this.colorString = str;
    }

    public final void setInnerList(MTMathList mTMathList) {
        this.innerList = mTMathList;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public String toLatexString() {
        String latexString;
        MTMathList mTMathList = this.innerList;
        if (mTMathList == null || (latexString = MTMathListBuilder.INSTANCE.toLatexString(mTMathList)) == null) {
            latexString = "";
        }
        return ij0.l("\\colorbox{", this.colorString, "}{", latexString, "}");
    }
}
