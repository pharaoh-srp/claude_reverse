package com.agog.mathdisplay.render;

import android.graphics.Color;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.MathDisplayLogger;
import com.agog.mathdisplay.parse.MTAccent;
import com.agog.mathdisplay.parse.MTBoxed;
import com.agog.mathdisplay.parse.MTCancel;
import com.agog.mathdisplay.parse.MTColumnAlignment;
import com.agog.mathdisplay.parse.MTFraction;
import com.agog.mathdisplay.parse.MTInner;
import com.agog.mathdisplay.parse.MTLargeOperator;
import com.agog.mathdisplay.parse.MTLineStyle;
import com.agog.mathdisplay.parse.MTMathAtom;
import com.agog.mathdisplay.parse.MTMathAtomType;
import com.agog.mathdisplay.parse.MTMathColor;
import com.agog.mathdisplay.parse.MTMathColorbox;
import com.agog.mathdisplay.parse.MTMathList;
import com.agog.mathdisplay.parse.MTMathSpace;
import com.agog.mathdisplay.parse.MTMathStyle;
import com.agog.mathdisplay.parse.MTMathTable;
import com.agog.mathdisplay.parse.MTMathTextColor;
import com.agog.mathdisplay.parse.MTOverLeftArrow;
import com.agog.mathdisplay.parse.MTOverLeftRightArrow;
import com.agog.mathdisplay.parse.MTOverLine;
import com.agog.mathdisplay.parse.MTOverRightArrow;
import com.agog.mathdisplay.parse.MTPhantom;
import com.agog.mathdisplay.parse.MTPhantomMode;
import com.agog.mathdisplay.parse.MTRadical;
import com.agog.mathdisplay.parse.MTUnderLine;
import com.agog.mathdisplay.parse.MTUnderOverBrace;
import com.agog.mathdisplay.parse.MathDisplayException;
import com.agog.mathdisplay.parse.NSRange;
import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.w44;
import defpackage.wg6;
import defpackage.x44;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u0000 Ù\u00012\u00020\u0001:\u0002Ù\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0010J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001aH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\u0010J/\u0010:\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u00182\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0004H\u0002¢\u0006\u0004\b<\u00100J\u0017\u0010?\u001a\u0002062\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u0002062\u0006\u00107\u001a\u00020A2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\fH\u0002¢\u0006\u0004\bD\u0010\u0010J\u0017\u0010F\u001a\u0002062\u0006\u0010E\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010M\u001a\u00020L2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010R\u001a\u00020O2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020\fH\u0002¢\u0006\u0004\bR\u0010SJ!\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010P\u001a\u00020O2\u0006\u0010T\u001a\u00020\fH\u0002¢\u0006\u0004\bV\u0010WJA\u0010]\u001a\u00020\f2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\u001f2\u0006\u0010T\u001a\u00020\f2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020(0Z2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\f0ZH\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010a\u001a\u0002062\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ'\u0010c\u001a\u0002062\u0006\u00107\u001a\u0002062\u0006\u0010`\u001a\u00020_2\u0006\u00109\u001a\u00020\fH\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u0002062\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0004\bg\u0010hJ\u001f\u0010k\u001a\u0002062\u0006\u0010j\u001a\u00020i2\u0006\u0010T\u001a\u00020\fH\u0002¢\u0006\u0004\bk\u0010lJ\u0019\u0010o\u001a\u0004\u0018\u0001062\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\bo\u0010pJ\u0019\u0010s\u001a\u0004\u0018\u0001062\u0006\u0010r\u001a\u00020qH\u0002¢\u0006\u0004\bs\u0010tJ\u0019\u0010v\u001a\u0004\u0018\u0001062\u0006\u0010r\u001a\u00020uH\u0002¢\u0006\u0004\bv\u0010wJ\u0019\u0010y\u001a\u0004\u0018\u0001062\u0006\u0010r\u001a\u00020xH\u0002¢\u0006\u0004\by\u0010zJ\u0019\u0010|\u001a\u0004\u0018\u0001062\u0006\u0010r\u001a\u00020{H\u0002¢\u0006\u0004\b|\u0010}J\u001c\u0010\u0080\u0001\u001a\u0004\u0018\u0001062\u0006\u0010\u007f\u001a\u00020~H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001e\u0010\u0084\u0001\u001a\u0004\u0018\u0001062\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001e\u0010\u0088\u0001\u001a\u0004\u0018\u0001062\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001e\u0010\u008c\u0001\u001a\u0004\u0018\u0001062\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001c\u0010\u0090\u0001\u001a\u00020\u00062\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J.\u0010\u0094\u0001\u001a\u00020\f2\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u0092\u0001\u001a\u00020\f2\u0007\u0010\u0093\u0001\u001a\u00020OH\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\"\u0010\u0097\u0001\u001a\u00020O2\u0006\u0010P\u001a\u00020O2\u0007\u0010\u0096\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0097\u0001\u0010SJ\u001e\u0010\u0098\u0001\u001a\u0004\u0018\u0001062\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009c\u0001\u001a\u0002062\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J:\u0010 \u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002060\u009e\u00010\u009e\u00012\b\u0010\u009b\u0001\u001a\u00030\u009a\u00012\u000e\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u009e\u0001H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J=\u0010¤\u0001\u001a\u00030£\u00012\u000e\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u0002060\u009e\u00012\b\u0010\u009b\u0001\u001a\u00030\u009a\u00012\u000e\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u009e\u0001H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J+\u0010§\u0001\u001a\u00020\u001c2\r\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u0002060Z2\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001e\u0010«\u0001\u001a\u00020\f2\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001e\u0010\u00ad\u0001\u001a\u00020\f2\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001H\u0002¢\u0006\u0006\b\u00ad\u0001\u0010¬\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R&\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0007\u0010±\u0001\u001a\u0005\b²\u0001\u00102\"\u0006\b³\u0001\u0010´\u0001R&\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\b\u0010±\u0001\u001a\u0005\bµ\u0001\u00102\"\u0006\b¶\u0001\u0010´\u0001R.\u0010·\u0001\u001a\b\u0012\u0004\u0012\u0002060Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0005\b»\u0001\u0010\"R\u001d\u0010½\u0001\u001a\u00030¼\u00018\u0006¢\u0006\u0010\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R)\u0010Á\u0001\u001a\u00020i8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R.\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÇ\u0001\u0010¸\u0001\u001a\u0006\bÈ\u0001\u0010º\u0001\"\u0005\bÉ\u0001\u0010\"R)\u0010Ê\u0001\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R)\u0010Ð\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010®\u0001\u001a\u0006\bÑ\u0001\u0010°\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R/\u0010\u0015\u001a\u00020\u00042\u0007\u0010Ô\u0001\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\b\u0015\u0010Õ\u0001\u001a\u0005\bÖ\u0001\u00100\"\u0006\b×\u0001\u0010Ø\u0001¨\u0006Ú\u0001"}, d2 = {"Lcom/agog/mathdisplay/render/MTTypesetter;", "", "Lcom/agog/mathdisplay/render/MTFont;", "font", "Lcom/agog/mathdisplay/parse/MTLineStyle;", "linestyle", "", "cramped", "spaced", "<init>", "(Lcom/agog/mathdisplay/render/MTFont;Lcom/agog/mathdisplay/parse/MTLineStyle;ZZ)V", "hasRule", "", "numeratorShiftUp", "(Z)F", "numeratorGapMin", "()F", "denominatorShiftDown", "denominatorGapMin", "stackGapMin", "fractionDelimiterHeight", "style", "getStyleSize", "(Lcom/agog/mathdisplay/parse/MTLineStyle;Lcom/agog/mathdisplay/render/MTFont;)F", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "prevNode", "Lcom/agog/mathdisplay/parse/MTMathAtomType;", "currentType", "Liei;", "addInterElementSpace", "(Lcom/agog/mathdisplay/parse/MTMathAtom;Lcom/agog/mathdisplay/parse/MTMathAtomType;)V", "", "preprocessed", "createDisplayAtoms", "(Ljava/util/List;)V", "Lcom/agog/mathdisplay/render/MTCTLineDisplay;", "addDisplayLine", "()Lcom/agog/mathdisplay/render/MTCTLineDisplay;", "Lcom/agog/mathdisplay/render/MTInterElementSpaceType;", "type", "", "getSpacingInMu", "(Lcom/agog/mathdisplay/render/MTInterElementSpaceType;)I", "left", "right", "getInterElementSpace", "(Lcom/agog/mathdisplay/parse/MTMathAtomType;Lcom/agog/mathdisplay/parse/MTMathAtomType;)F", "scriptStyle", "()Lcom/agog/mathdisplay/parse/MTLineStyle;", "subScriptCramped", "()Z", "superScriptCramped", "superScriptShiftUp", "atom", "Lcom/agog/mathdisplay/render/MTDisplay;", "display", "index", "delta", "makeScripts", "(Lcom/agog/mathdisplay/parse/MTMathAtom;Lcom/agog/mathdisplay/render/MTDisplay;IF)V", "fractionStyle", "Lcom/agog/mathdisplay/parse/MTFraction;", "frac", "makeFraction", "(Lcom/agog/mathdisplay/parse/MTFraction;)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/render/MTFractionDisplay;", "addDelimitersToFractionDisplay", "(Lcom/agog/mathdisplay/render/MTFractionDisplay;Lcom/agog/mathdisplay/parse/MTFraction;)Lcom/agog/mathdisplay/render/MTDisplay;", "radicalVerticalGap", "radicalHeight", "getRadicalGlyphWithHeight", "(F)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTMathList;", "radicand", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "Lcom/agog/mathdisplay/render/MTRadicalDisplay;", "makeRadical", "(Lcom/agog/mathdisplay/parse/MTMathList;Lcom/agog/mathdisplay/parse/NSRange;)Lcom/agog/mathdisplay/render/MTRadicalDisplay;", "Lcom/agog/mathdisplay/render/CGGlyph;", "glyph", "height", "findGlyph", "(Lcom/agog/mathdisplay/render/CGGlyph;F)Lcom/agog/mathdisplay/render/CGGlyph;", "glyphHeight", "Lcom/agog/mathdisplay/render/MTGlyphConstructionDisplay;", "constructGlyph", "(Lcom/agog/mathdisplay/render/CGGlyph;F)Lcom/agog/mathdisplay/render/MTGlyphConstructionDisplay;", "Lcom/agog/mathdisplay/render/MTGlyphPart;", "parts", "", "glyphs", "offsets", "constructGlyphWithParts", "(Ljava/util/List;FLjava/util/List;Ljava/util/List;)F", "Lcom/agog/mathdisplay/parse/MTLargeOperator;", "op", "makeLargeOp", "(Lcom/agog/mathdisplay/parse/MTLargeOperator;)Lcom/agog/mathdisplay/render/MTDisplay;", "addLimitsToDisplay", "(Lcom/agog/mathdisplay/render/MTDisplay;Lcom/agog/mathdisplay/parse/MTLargeOperator;F)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTInner;", "inner", "makeLeftRight", "(Lcom/agog/mathdisplay/parse/MTInner;)Lcom/agog/mathdisplay/render/MTDisplay;", "", "delimiter", "findGlyphForBoundary", "(Ljava/lang/String;F)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTUnderLine;", "under", "makeUnderline", "(Lcom/agog/mathdisplay/parse/MTUnderLine;)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTOverLine;", "over", "makeOverline", "(Lcom/agog/mathdisplay/parse/MTOverLine;)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTOverLeftArrow;", "makeOverLeftArrow", "(Lcom/agog/mathdisplay/parse/MTOverLeftArrow;)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTOverRightArrow;", "makeOverRightArrow", "(Lcom/agog/mathdisplay/parse/MTOverRightArrow;)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTOverLeftRightArrow;", "makeOverLeftRightArrow", "(Lcom/agog/mathdisplay/parse/MTOverLeftRightArrow;)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTCancel;", "cancel", "makeCancel", "(Lcom/agog/mathdisplay/parse/MTCancel;)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTBoxed;", "boxed", "makeBoxed", "(Lcom/agog/mathdisplay/parse/MTBoxed;)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTPhantom;", "phantom", "makePhantom", "(Lcom/agog/mathdisplay/parse/MTPhantom;)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTUnderOverBrace;", "brace", "makeUnderOverBrace", "(Lcom/agog/mathdisplay/parse/MTUnderOverBrace;)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTAccent;", "accent", "isSingleCharAccentee", "(Lcom/agog/mathdisplay/parse/MTAccent;)Z", "accenteeWidth", "accentGlyph", "getSkew", "(Lcom/agog/mathdisplay/parse/MTAccent;FLcom/agog/mathdisplay/render/CGGlyph;)F", "maxWidth", "findVariantGlyph", "makeAccent", "(Lcom/agog/mathdisplay/parse/MTAccent;)Lcom/agog/mathdisplay/render/MTDisplay;", "Lcom/agog/mathdisplay/parse/MTMathTable;", "table", "makeTable", "(Lcom/agog/mathdisplay/parse/MTMathTable;)Lcom/agog/mathdisplay/render/MTDisplay;", "", "columnWidths", "typesetCells", "(Lcom/agog/mathdisplay/parse/MTMathTable;[Ljava/lang/Float;)[[Lcom/agog/mathdisplay/render/MTDisplay;", "cols", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "makeRowWithColumns", "([Lcom/agog/mathdisplay/render/MTDisplay;Lcom/agog/mathdisplay/parse/MTMathTable;[Ljava/lang/Float;)Lcom/agog/mathdisplay/render/MTMathListDisplay;", "rows", "positionRows", "(Ljava/util/List;Lcom/agog/mathdisplay/parse/MTMathTable;)V", "Lcom/agog/mathdisplay/render/BoundingBox;", "bbox", "getBboxDetailsDescent", "(Lcom/agog/mathdisplay/render/BoundingBox;)F", "getBboxDetailsAscent", "Lcom/agog/mathdisplay/render/MTFont;", "getFont", "()Lcom/agog/mathdisplay/render/MTFont;", "Z", "getCramped", "setCramped", "(Z)V", "getSpaced", "setSpaced", "displayAtoms", "Ljava/util/List;", "getDisplayAtoms", "()Ljava/util/List;", "setDisplayAtoms", "Lcom/agog/mathdisplay/render/CGPoint;", "currentPosition", "Lcom/agog/mathdisplay/render/CGPoint;", "getCurrentPosition", "()Lcom/agog/mathdisplay/render/CGPoint;", "currentLine", "Ljava/lang/String;", "getCurrentLine", "()Ljava/lang/String;", "setCurrentLine", "(Ljava/lang/String;)V", "currentAtoms", "getCurrentAtoms", "setCurrentAtoms", "currentLineIndexRange", "Lcom/agog/mathdisplay/parse/NSRange;", "getCurrentLineIndexRange", "()Lcom/agog/mathdisplay/parse/NSRange;", "setCurrentLineIndexRange", "(Lcom/agog/mathdisplay/parse/NSRange;)V", "styleFont", "getStyleFont", "setStyleFont", "(Lcom/agog/mathdisplay/render/MTFont;)V", ExperienceToggle.DEFAULT_PARAM_KEY, "Lcom/agog/mathdisplay/parse/MTLineStyle;", "getStyle", "setStyle", "(Lcom/agog/mathdisplay/parse/MTLineStyle;)V", "Companion", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTTypesetter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean cramped;
    private List<MTMathAtom> currentAtoms;
    private String currentLine;
    private NSRange currentLineIndexRange;
    private final CGPoint currentPosition;
    private List<MTDisplay> displayAtoms;
    private final MTFont font;
    private boolean spaced;
    private MTLineStyle style;
    private MTFont styleFont;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = mdj.f)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[MTLineStyle.values().length];
            try {
                iArr[MTLineStyle.KMTLineStyleDisplay.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MTLineStyle.KMTLineStyleText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MTLineStyle.KMTLineStyleScript.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MTLineStyle.KMTLineStyleScriptScript.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MTMathAtomType.values().length];
            try {
                iArr2[MTMathAtomType.KMTMathAtomNone.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomNumber.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomVariable.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomUnaryOperator.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomBoundary.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomSpace.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomStyle.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomColor.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomColorbox.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomTextColor.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomRadical.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomFraction.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomLargeOperator.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomInner.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomUnderline.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomOverline.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomAccent.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomCancel.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomBoxed.ordinal()] = 19;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomPhantom.ordinal()] = 20;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomUnderOverBrace.ordinal()] = 21;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomTable.ordinal()] = 22;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomOrdinary.ordinal()] = 23;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomBinaryOperator.ordinal()] = 24;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomRelation.ordinal()] = 25;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomOpen.ordinal()] = 26;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomClose.ordinal()] = 27;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomPlaceholder.ordinal()] = 28;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[MTMathAtomType.KMTMathAtomPunctuation.ordinal()] = 29;
            } catch (NoSuchFieldError unused33) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MTInterElementSpaceType.values().length];
            try {
                iArr3[MTInterElementSpaceType.KMTSpaceInvalid.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[MTInterElementSpaceType.KMTSpaceNone.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[MTInterElementSpaceType.KMTSpaceThin.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[MTInterElementSpaceType.KMTSpaceNSThin.ordinal()] = 4;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[MTInterElementSpaceType.KMTSpaceNSMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[MTInterElementSpaceType.KMTSpaceNSThick.ordinal()] = 6;
            } catch (NoSuchFieldError unused39) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[MTPhantomMode.values().length];
            try {
                iArr4[MTPhantomMode.Full.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr4[MTPhantomMode.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr4[MTPhantomMode.Vertical.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[MTColumnAlignment.values().length];
            try {
                iArr5[MTColumnAlignment.KMTColumnAlignmentRight.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[MTColumnAlignment.KMTColumnAlignmentCenter.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr5[MTColumnAlignment.KMTColumnAlignmentLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public MTTypesetter(MTFont mTFont, MTLineStyle mTLineStyle, boolean z, boolean z2) {
        mTFont.getClass();
        mTLineStyle.getClass();
        this.font = mTFont;
        this.cramped = z;
        this.spaced = z2;
        this.displayAtoms = new ArrayList();
        this.currentPosition = new CGPoint(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
        this.currentLine = "";
        this.currentAtoms = new ArrayList();
        this.currentLineIndexRange = new NSRange(0, 0, 3, null);
        this.styleFont = mTFont;
        this.style = MTLineStyle.KMTLineStyleDisplay;
        setStyle(mTLineStyle);
    }

    private final MTDisplay addDelimitersToFractionDisplay(MTFractionDisplay display, MTFraction frac) {
        if (frac.getLeftDelimiter() == null) {
            frac.getRightDelimiter();
        }
        ArrayList arrayList = new ArrayList(0);
        float fFractionDelimiterHeight = fractionDelimiterHeight();
        CGPoint cGPoint = new CGPoint(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null);
        String leftDelimiter = frac.getLeftDelimiter();
        if (leftDelimiter != null && leftDelimiter.length() > 0) {
            MTDisplay mTDisplayFindGlyphForBoundary = findGlyphForBoundary(leftDelimiter, fFractionDelimiterHeight);
            mTDisplayFindGlyphForBoundary.setPosition(CGPoint.copy$default(cGPoint, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null));
            cGPoint.setX(mTDisplayFindGlyphForBoundary.getWidth() + cGPoint.getX());
            arrayList.add(mTDisplayFindGlyphForBoundary);
        }
        display.setPosition(CGPoint.copy$default(cGPoint, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null));
        cGPoint.setX(display.getWidth() + cGPoint.getX());
        arrayList.add(display);
        String rightDelimiter = frac.getRightDelimiter();
        if (rightDelimiter != null && rightDelimiter.length() > 0) {
            MTDisplay mTDisplayFindGlyphForBoundary2 = findGlyphForBoundary(rightDelimiter, fFractionDelimiterHeight);
            mTDisplayFindGlyphForBoundary2.setPosition(CGPoint.copy$default(cGPoint, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null));
            cGPoint.setX(mTDisplayFindGlyphForBoundary2.getWidth() + cGPoint.getX());
            arrayList.add(mTDisplayFindGlyphForBoundary2);
        }
        MTMathListDisplay mTMathListDisplay = new MTMathListDisplay(arrayList, frac.getIndexRange());
        mTMathListDisplay.setPosition(this.currentPosition);
        return mTMathListDisplay;
    }

    private final MTCTLineDisplay addDisplayLine() {
        MTCTLineDisplay mTCTLineDisplay = new MTCTLineDisplay(this.currentLine, this.currentLineIndexRange, this.styleFont, this.currentAtoms);
        mTCTLineDisplay.setPosition(this.currentPosition);
        this.displayAtoms.add(mTCTLineDisplay);
        CGPoint cGPoint = this.currentPosition;
        cGPoint.setX(mTCTLineDisplay.getWidth() + cGPoint.getX());
        this.currentLine = "";
        this.currentAtoms = new ArrayList();
        this.currentLineIndexRange = new NSRange(0, 0, 3, null);
        return mTCTLineDisplay;
    }

    private final void addInterElementSpace(MTMathAtom prevNode, MTMathAtomType currentType) {
        float interElementSpace = prevNode != null ? getInterElementSpace(prevNode.getType(), currentType) : this.spaced ? getInterElementSpace(MTMathAtomType.KMTMathAtomOpen, currentType) : MTTypesetterKt.kLineSkipLimitMultiplier;
        CGPoint cGPoint = this.currentPosition;
        cGPoint.setX(cGPoint.getX() + interElementSpace);
    }

    private final MTDisplay addLimitsToDisplay(MTDisplay display, MTLargeOperator op, float delta) {
        MTMathListDisplay mTMathListDisplayCreateLineForMathList;
        MTMathListDisplay mTMathListDisplayCreateLineForMathList2;
        if (op.getSubScript() == null && op.getSuperScript() == null) {
            CGPoint cGPoint = this.currentPosition;
            cGPoint.setX(display.getWidth() + cGPoint.getX());
            return display;
        }
        if (!op.getHasLimits() || this.style != MTLineStyle.KMTLineStyleDisplay) {
            CGPoint cGPoint2 = this.currentPosition;
            cGPoint2.setX(display.getWidth() + cGPoint2.getX());
            makeScripts(op, display, op.getIndexRange().getLocation(), delta);
            return display;
        }
        if (op.getSuperScript() != null) {
            Companion companion = INSTANCE;
            MTMathList superScript = op.getSuperScript();
            superScript.getClass();
            mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(superScript, this.font, scriptStyle(), getCramped());
        } else {
            mTMathListDisplayCreateLineForMathList = null;
        }
        if (op.getSubScript() != null) {
            Companion companion2 = INSTANCE;
            MTMathList subScript = op.getSubScript();
            subScript.getClass();
            mTMathListDisplayCreateLineForMathList2 = companion2.createLineForMathList(subScript, this.font, scriptStyle(), subScriptCramped());
        } else {
            mTMathListDisplayCreateLineForMathList2 = null;
        }
        MTLargeOpLimitsDisplay mTLargeOpLimitsDisplay = new MTLargeOpLimitsDisplay(display, mTMathListDisplayCreateLineForMathList, mTMathListDisplayCreateLineForMathList2, delta / 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier);
        if (mTMathListDisplayCreateLineForMathList != null) {
            mTLargeOpLimitsDisplay.setUpperLimitGap(Math.max(this.styleFont.getMathTable().getUpperLimitGapMin(), this.styleFont.getMathTable().getUpperLimitBaselineRiseMin() - mTMathListDisplayCreateLineForMathList.getDescent()));
        }
        if (mTMathListDisplayCreateLineForMathList2 != null) {
            mTLargeOpLimitsDisplay.setLowerLimitGap(Math.max(this.styleFont.getMathTable().getLowerLimitGapMin(), this.styleFont.getMathTable().getLowerLimitBaselineDropMin() - mTMathListDisplayCreateLineForMathList2.getAscent()));
        }
        mTLargeOpLimitsDisplay.setPosition(this.currentPosition);
        mTLargeOpLimitsDisplay.setRange(NSRange.copy$default(op.getIndexRange(), 0, 0, 3, null));
        CGPoint cGPoint3 = this.currentPosition;
        cGPoint3.setX(mTLargeOpLimitsDisplay.getWidth() + cGPoint3.getX());
        return mTLargeOpLimitsDisplay;
    }

    private final MTGlyphConstructionDisplay constructGlyph(CGGlyph glyph, float glyphHeight) {
        List<MTGlyphPart> verticalGlyphAssemblyForGlyph = this.styleFont.getMathTable().getVerticalGlyphAssemblyForGlyph(glyph.getGid());
        if (verticalGlyphAssemblyForGlyph == null || verticalGlyphAssemblyForGlyph.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0);
        ArrayList arrayList2 = new ArrayList(0);
        float fConstructGlyphWithParts = constructGlyphWithParts(verticalGlyphAssemblyForGlyph, glyphHeight, arrayList, arrayList2);
        Float[] fArr = {Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier)};
        this.styleFont.getMathTable().getAdvancesForGlyphs(w44.p1(arrayList), fArr, 1);
        MTGlyphConstructionDisplay mTGlyphConstructionDisplay = new MTGlyphConstructionDisplay(arrayList, arrayList2, this.styleFont);
        mTGlyphConstructionDisplay.setWidth(fArr[0].floatValue());
        mTGlyphConstructionDisplay.setAscent(fConstructGlyphWithParts);
        mTGlyphConstructionDisplay.setDescent(MTTypesetterKt.kLineSkipLimitMultiplier);
        return mTGlyphConstructionDisplay;
    }

    private final float constructGlyphWithParts(List<MTGlyphPart> parts, float glyphHeight, List<Integer> glyphs, List<Float> offsets) {
        int i = 0;
        while (true) {
            float minConnectorOverlap = this.styleFont.getMathTable().getMinConnectorOverlap();
            glyphs.clear();
            offsets.clear();
            Iterator<MTGlyphPart> it = parts.iterator();
            float fFloatValue = MTTypesetterKt.kLineSkipLimitMultiplier;
            MTGlyphPart mTGlyphPart = null;
            float fMin = 1000000.0f;
            float f = 0.0f;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MTGlyphPart next = it.next();
                int i2 = next.isExtender() ? i : 1;
                int i3 = 0;
                while (i3 < i2) {
                    glyphs.add(Integer.valueOf(next.getGlyph()));
                    if (mTGlyphPart != null) {
                        float fullAdvance = mTGlyphPart.getFullAdvance() - Math.min(mTGlyphPart.getEndConnectorLength(), next.getStartConnectorLength());
                        fMin = Math.min(fMin, (mTGlyphPart.getFullAdvance() - minConnectorOverlap) - fullAdvance);
                        f += fullAdvance;
                    }
                    offsets.add(Float.valueOf(f));
                    i3++;
                    mTGlyphPart = next;
                }
            }
            if (mTGlyphPart != null) {
                float fullAdvance2 = mTGlyphPart.getFullAdvance() + f;
                List<Integer> list = glyphs;
                float size = (fMin * (list.size() - 1)) + fullAdvance2;
                if (fullAdvance2 >= glyphHeight) {
                    return fullAdvance2;
                }
                if (glyphHeight <= size) {
                    float size2 = (glyphHeight - fullAdvance2) / (list.size() - 1);
                    int size3 = offsets.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        fFloatValue = (i4 * size2) + offsets.get(i4).floatValue();
                        offsets.set(i4, Float.valueOf(fFloatValue));
                    }
                    return mTGlyphPart.getFullAdvance() + fFloatValue;
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createDisplayAtoms(List<? extends MTMathAtom> preprocessed) throws MathDisplayException {
        MTDisplay mTDisplayMakeLeftRight;
        MTMathAtomType type = MTMathAtomType.KMTMathAtomNone;
        MTMathAtom mTMathAtom = null;
        for (MTMathAtom mTMathAtom2 : preprocessed) {
            switch (WhenMappings.$EnumSwitchMapping$1[mTMathAtom2.getType().ordinal()]) {
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                    throw new MathDisplayException("These types should never show here as they are removed by preprocessing");
                case 5:
                    throw new MathDisplayException("A boundary atom should never be inside a mathlist.");
                case 6:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    CGPoint cGPoint = this.currentPosition;
                    cGPoint.setX((this.styleFont.getMathTable().muUnit() * ((MTMathSpace) mTMathAtom2).getSpace()) + cGPoint.getX());
                    continue;
                case 7:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    setStyle(((MTMathStyle) mTMathAtom2).getStyle());
                    continue;
                case 8:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTMathColor mTMathColor = (MTMathColor) mTMathAtom2;
                    if (mTMathColor.getInnerList() != null) {
                        Companion companion = INSTANCE;
                        MTMathList innerList = mTMathColor.getInnerList();
                        innerList.getClass();
                        MTMathListDisplay mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(innerList, this.font, this.style);
                        try {
                            mTMathListDisplayCreateLineForMathList.setLocalTextColor(Color.parseColor(mTMathColor.getColorString()));
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                        mTMathListDisplayCreateLineForMathList.setPosition(this.currentPosition);
                        CGPoint cGPoint2 = this.currentPosition;
                        cGPoint2.setX(mTMathListDisplayCreateLineForMathList.getWidth() + cGPoint2.getX());
                        this.displayAtoms.add(mTMathListDisplayCreateLineForMathList);
                    }
                    break;
                case 9:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTMathColorbox mTMathColorbox = (MTMathColorbox) mTMathAtom2;
                    if (mTMathColorbox.getInnerList() != null) {
                        Companion companion2 = INSTANCE;
                        MTMathList innerList2 = mTMathColorbox.getInnerList();
                        innerList2.getClass();
                        MTMathListDisplay mTMathListDisplayCreateLineForMathList2 = companion2.createLineForMathList(innerList2, this.font, this.style);
                        mTMathListDisplayCreateLineForMathList2.setPosition(this.currentPosition);
                        CGPoint cGPoint3 = this.currentPosition;
                        cGPoint3.setX(mTMathListDisplayCreateLineForMathList2.getWidth() + cGPoint3.getX());
                        this.displayAtoms.add(mTMathListDisplayCreateLineForMathList2);
                    }
                    break;
                case 10:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTMathTextColor mTMathTextColor = (MTMathTextColor) mTMathAtom2;
                    if (mTMathTextColor.getInnerList() != null) {
                        Companion companion3 = INSTANCE;
                        MTMathList innerList3 = mTMathTextColor.getInnerList();
                        innerList3.getClass();
                        MTMathListDisplay mTMathListDisplayCreateLineForMathList3 = companion3.createLineForMathList(innerList3, this.font, this.style);
                        try {
                            mTMathListDisplayCreateLineForMathList3.setLocalTextColor(Color.parseColor(mTMathTextColor.getColorString()));
                            break;
                        } catch (IllegalArgumentException unused2) {
                        }
                        if (mTMathAtom != null) {
                            MTMathAtomType type2 = mTMathAtom.getType();
                            List<MTDisplay> subDisplays = mTMathListDisplayCreateLineForMathList3.getSubDisplays();
                            subDisplays.getClass();
                            MTDisplay mTDisplay = subDisplays.get(0);
                            mTDisplay.getClass();
                            float interElementSpace = getInterElementSpace(type2, ((MTCTLineDisplay) mTDisplay).getAtoms().get(0).getType());
                            if (this.currentLine.length() <= 0) {
                                CGPoint cGPoint4 = this.currentPosition;
                                cGPoint4.setX(cGPoint4.getX() + interElementSpace);
                            } else if (interElementSpace > MTTypesetterKt.kLineSkipLimitMultiplier) {
                                CGPoint cGPoint5 = this.currentPosition;
                                cGPoint5.setX(cGPoint5.getX() + interElementSpace);
                            }
                        }
                        mTMathListDisplayCreateLineForMathList3.setPosition(this.currentPosition);
                        CGPoint cGPoint6 = this.currentPosition;
                        cGPoint6.setX(mTMathListDisplayCreateLineForMathList3.getWidth() + cGPoint6.getX());
                        this.displayAtoms.add(mTMathListDisplayCreateLineForMathList3);
                    }
                    break;
                case 11:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTRadical mTRadical = (MTRadical) mTMathAtom2;
                    addInterElementSpace(mTMathAtom, MTMathAtomType.KMTMathAtomOrdinary);
                    MTMathList radicand = mTRadical.getRadicand();
                    radicand.getClass();
                    MTRadicalDisplay mTRadicalDisplayMakeRadical = makeRadical(radicand, mTRadical.getIndexRange());
                    if (mTRadical.getDegree() != null) {
                        Companion companion4 = INSTANCE;
                        MTMathList degree = mTRadical.getDegree();
                        degree.getClass();
                        mTRadicalDisplayMakeRadical.setDegree(companion4.createLineForMathList(degree, this.font, MTLineStyle.KMTLineStyleScriptScript), this.styleFont.getMathTable());
                    }
                    this.displayAtoms.add(mTRadicalDisplayMakeRadical);
                    CGPoint cGPoint7 = this.currentPosition;
                    cGPoint7.setX(mTRadicalDisplayMakeRadical.getWidth() + cGPoint7.getX());
                    if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                        makeScripts(mTMathAtom2, mTRadicalDisplayMakeRadical, mTRadical.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                    }
                    break;
                case 12:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTFraction mTFraction = (MTFraction) mTMathAtom2;
                    addInterElementSpace(mTMathAtom, mTMathAtom2.getType());
                    MTDisplay mTDisplayMakeFraction = makeFraction(mTFraction);
                    this.displayAtoms.add(mTDisplayMakeFraction);
                    CGPoint cGPoint8 = this.currentPosition;
                    cGPoint8.setX(mTDisplayMakeFraction.getWidth() + cGPoint8.getX());
                    if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                        makeScripts(mTMathAtom2, mTDisplayMakeFraction, mTFraction.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                    }
                    break;
                case 13:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    addInterElementSpace(mTMathAtom, mTMathAtom2.getType());
                    this.displayAtoms.add(makeLargeOp((MTLargeOperator) mTMathAtom2));
                    break;
                case 14:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTInner mTInner = (MTInner) mTMathAtom2;
                    MTMathAtomType sizedDelimiterType = mTInner.getSizedDelimiterType();
                    if (sizedDelimiterType == null) {
                        sizedDelimiterType = mTMathAtom2.getType();
                    }
                    addInterElementSpace(mTMathAtom, sizedDelimiterType);
                    if (mTInner.getSizedDelimiterType() != null) {
                        mTMathAtom2.setType(sizedDelimiterType);
                    }
                    if (mTInner.getLeftBoundary() != null || mTInner.getRightBoundary() != null) {
                        mTDisplayMakeLeftRight = makeLeftRight(mTInner);
                    } else if (mTInner.getInnerList() != null) {
                        Companion companion5 = INSTANCE;
                        MTMathList innerList4 = mTInner.getInnerList();
                        innerList4.getClass();
                        mTDisplayMakeLeftRight = companion5.createLineForMathList(innerList4, this.font, this.style, this.cramped);
                    } else {
                        mTDisplayMakeLeftRight = null;
                    }
                    if (mTDisplayMakeLeftRight != null) {
                        mTDisplayMakeLeftRight.setPosition(this.currentPosition);
                        CGPoint cGPoint9 = this.currentPosition;
                        cGPoint9.setX(mTDisplayMakeLeftRight.getWidth() + cGPoint9.getX());
                        this.displayAtoms.add(mTDisplayMakeLeftRight);
                        if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                            makeScripts(mTMathAtom2, mTDisplayMakeLeftRight, mTInner.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                        }
                    }
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTMathAtomType mTMathAtomType = MTMathAtomType.KMTMathAtomOrdinary;
                    addInterElementSpace(mTMathAtom, mTMathAtomType);
                    mTMathAtom2.setType(mTMathAtomType);
                    MTUnderLine mTUnderLine = (MTUnderLine) mTMathAtom2;
                    MTDisplay mTDisplayMakeUnderline = makeUnderline(mTUnderLine);
                    if (mTDisplayMakeUnderline != null) {
                        this.displayAtoms.add(mTDisplayMakeUnderline);
                        CGPoint cGPoint10 = this.currentPosition;
                        cGPoint10.setX(mTDisplayMakeUnderline.getWidth() + cGPoint10.getX());
                        if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                            makeScripts(mTMathAtom2, mTDisplayMakeUnderline, mTUnderLine.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                        }
                    }
                    break;
                case 16:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTMathAtomType mTMathAtomType2 = MTMathAtomType.KMTMathAtomOrdinary;
                    addInterElementSpace(mTMathAtom, mTMathAtomType2);
                    mTMathAtom2.setType(mTMathAtomType2);
                    if (mTMathAtom2 instanceof MTOverLeftArrow) {
                        MTOverLeftArrow mTOverLeftArrow = (MTOverLeftArrow) mTMathAtom2;
                        MTDisplay mTDisplayMakeOverLeftArrow = makeOverLeftArrow(mTOverLeftArrow);
                        if (mTDisplayMakeOverLeftArrow != null) {
                            this.displayAtoms.add(mTDisplayMakeOverLeftArrow);
                            CGPoint cGPoint11 = this.currentPosition;
                            cGPoint11.setX(mTDisplayMakeOverLeftArrow.getWidth() + cGPoint11.getX());
                            if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                                makeScripts(mTMathAtom2, mTDisplayMakeOverLeftArrow, mTOverLeftArrow.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                            }
                        }
                    } else if (mTMathAtom2 instanceof MTOverRightArrow) {
                        MTOverRightArrow mTOverRightArrow = (MTOverRightArrow) mTMathAtom2;
                        MTDisplay mTDisplayMakeOverRightArrow = makeOverRightArrow(mTOverRightArrow);
                        if (mTDisplayMakeOverRightArrow != null) {
                            this.displayAtoms.add(mTDisplayMakeOverRightArrow);
                            CGPoint cGPoint12 = this.currentPosition;
                            cGPoint12.setX(mTDisplayMakeOverRightArrow.getWidth() + cGPoint12.getX());
                            if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                                makeScripts(mTMathAtom2, mTDisplayMakeOverRightArrow, mTOverRightArrow.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                            }
                        }
                    } else if (mTMathAtom2 instanceof MTOverLeftRightArrow) {
                        MTOverLeftRightArrow mTOverLeftRightArrow = (MTOverLeftRightArrow) mTMathAtom2;
                        MTDisplay mTDisplayMakeOverLeftRightArrow = makeOverLeftRightArrow(mTOverLeftRightArrow);
                        if (mTDisplayMakeOverLeftRightArrow != null) {
                            this.displayAtoms.add(mTDisplayMakeOverLeftRightArrow);
                            CGPoint cGPoint13 = this.currentPosition;
                            cGPoint13.setX(mTDisplayMakeOverLeftRightArrow.getWidth() + cGPoint13.getX());
                            if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                                makeScripts(mTMathAtom2, mTDisplayMakeOverLeftRightArrow, mTOverLeftRightArrow.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                            }
                        }
                    } else {
                        MTOverLine mTOverLine = (MTOverLine) mTMathAtom2;
                        MTDisplay mTDisplayMakeOverline = makeOverline(mTOverLine);
                        if (mTDisplayMakeOverline != null) {
                            this.displayAtoms.add(mTDisplayMakeOverline);
                            CGPoint cGPoint14 = this.currentPosition;
                            cGPoint14.setX(mTDisplayMakeOverline.getWidth() + cGPoint14.getX());
                            if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                                makeScripts(mTMathAtom2, mTDisplayMakeOverline, mTOverLine.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                            }
                        }
                    }
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTMathAtomType mTMathAtomType3 = MTMathAtomType.KMTMathAtomOrdinary;
                    addInterElementSpace(mTMathAtom, mTMathAtomType3);
                    mTMathAtom2.setType(mTMathAtomType3);
                    MTAccent mTAccent = (MTAccent) mTMathAtom2;
                    MTDisplay mTDisplayMakeAccent = makeAccent(mTAccent);
                    if (mTDisplayMakeAccent != null) {
                        this.displayAtoms.add(mTDisplayMakeAccent);
                        CGPoint cGPoint15 = this.currentPosition;
                        cGPoint15.setX(mTDisplayMakeAccent.getWidth() + cGPoint15.getX());
                        if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                            makeScripts(mTMathAtom2, mTDisplayMakeAccent, mTAccent.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                        }
                    }
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTMathAtomType mTMathAtomType4 = MTMathAtomType.KMTMathAtomOrdinary;
                    addInterElementSpace(mTMathAtom, mTMathAtomType4);
                    mTMathAtom2.setType(mTMathAtomType4);
                    MTCancel mTCancel = (MTCancel) mTMathAtom2;
                    MTDisplay mTDisplayMakeCancel = makeCancel(mTCancel);
                    if (mTDisplayMakeCancel != null) {
                        this.displayAtoms.add(mTDisplayMakeCancel);
                        CGPoint cGPoint16 = this.currentPosition;
                        cGPoint16.setX(mTDisplayMakeCancel.getWidth() + cGPoint16.getX());
                        if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                            makeScripts(mTMathAtom2, mTDisplayMakeCancel, mTCancel.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                        }
                    }
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTMathAtomType mTMathAtomType5 = MTMathAtomType.KMTMathAtomOrdinary;
                    addInterElementSpace(mTMathAtom, mTMathAtomType5);
                    mTMathAtom2.setType(mTMathAtomType5);
                    MTBoxed mTBoxed = (MTBoxed) mTMathAtom2;
                    MTDisplay mTDisplayMakeBoxed = makeBoxed(mTBoxed);
                    if (mTDisplayMakeBoxed != null) {
                        this.displayAtoms.add(mTDisplayMakeBoxed);
                        CGPoint cGPoint17 = this.currentPosition;
                        cGPoint17.setX(mTDisplayMakeBoxed.getWidth() + cGPoint17.getX());
                        if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                            makeScripts(mTMathAtom2, mTDisplayMakeBoxed, mTBoxed.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                        }
                    }
                    break;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTMathAtomType mTMathAtomType6 = MTMathAtomType.KMTMathAtomOrdinary;
                    addInterElementSpace(mTMathAtom, mTMathAtomType6);
                    mTMathAtom2.setType(mTMathAtomType6);
                    MTPhantom mTPhantom = (MTPhantom) mTMathAtom2;
                    MTDisplay mTDisplayMakePhantom = makePhantom(mTPhantom);
                    if (mTDisplayMakePhantom != null) {
                        this.displayAtoms.add(mTDisplayMakePhantom);
                        CGPoint cGPoint18 = this.currentPosition;
                        cGPoint18.setX(mTDisplayMakePhantom.getWidth() + cGPoint18.getX());
                        if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                            makeScripts(mTMathAtom2, mTDisplayMakePhantom, mTPhantom.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                        }
                    }
                    break;
                case 21:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTMathAtomType mTMathAtomType7 = MTMathAtomType.KMTMathAtomOrdinary;
                    addInterElementSpace(mTMathAtom, mTMathAtomType7);
                    mTMathAtom2.setType(mTMathAtomType7);
                    MTUnderOverBrace mTUnderOverBrace = (MTUnderOverBrace) mTMathAtom2;
                    MTDisplay mTDisplayMakeUnderOverBrace = makeUnderOverBrace(mTUnderOverBrace);
                    if (mTDisplayMakeUnderOverBrace != null) {
                        this.displayAtoms.add(mTDisplayMakeUnderOverBrace);
                        CGPoint cGPoint19 = this.currentPosition;
                        cGPoint19.setX(mTDisplayMakeUnderOverBrace.getWidth() + cGPoint19.getX());
                        if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                            makeScripts(mTMathAtom2, mTDisplayMakeUnderOverBrace, mTUnderOverBrace.getIndexRange().getLocation(), MTTypesetterKt.kLineSkipLimitMultiplier);
                        }
                    }
                    break;
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    MTMathAtomType mTMathAtomType8 = MTMathAtomType.KMTMathAtomInner;
                    addInterElementSpace(mTMathAtom, mTMathAtomType8);
                    mTMathAtom2.setType(mTMathAtomType8);
                    MTDisplay mTDisplayMakeTable = makeTable((MTMathTable) mTMathAtom2);
                    this.displayAtoms.add(mTDisplayMakeTable);
                    CGPoint cGPoint20 = this.currentPosition;
                    cGPoint20.setX(mTDisplayMakeTable.getWidth() + cGPoint20.getX());
                    break;
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                case 24:
                case BuildConfig.VERSION_CODE /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                    if (this.currentLine.length() > 0) {
                        addDisplayLine();
                    }
                    if (mTMathAtom != null) {
                        float interElementSpace2 = getInterElementSpace(mTMathAtom.getType(), mTMathAtom2.getType());
                        if (this.currentLine.length() <= 0) {
                            CGPoint cGPoint21 = this.currentPosition;
                            cGPoint21.setX(cGPoint21.getX() + interElementSpace2);
                        } else if (interElementSpace2 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                            CGPoint cGPoint22 = this.currentPosition;
                            cGPoint22.setX(cGPoint22.getX() + interElementSpace2);
                        }
                    }
                    this.currentLine = kgh.o(this.currentLine, mTMathAtom2.getNucleus());
                    int location = this.currentLineIndexRange.getLocation();
                    NSRange nSRange = this.currentLineIndexRange;
                    if (location == -1) {
                        nSRange.setLocation(mTMathAtom2.getIndexRange().getLocation());
                        this.currentLineIndexRange.setLength(mTMathAtom2.getIndexRange().getLength());
                    } else {
                        nSRange.setLength(mTMathAtom2.getIndexRange().getLength() + nSRange.getLength());
                    }
                    int size = mTMathAtom2.getFusedAtoms().size();
                    List<MTMathAtom> list = this.currentAtoms;
                    if (size > 0) {
                        list.addAll(mTMathAtom2.getFusedAtoms());
                    } else {
                        list.add(mTMathAtom2);
                    }
                    if (mTMathAtom2.getSubScript() != null || mTMathAtom2.getSuperScript() != null) {
                        MTCTLineDisplay mTCTLineDisplayAddDisplayLine = addDisplayLine();
                        float italicCorrection = mTMathAtom2.getNucleus().length() > 0 ? this.styleFont.getMathTable().getItalicCorrection(this.styleFont.findGlyphForCharacterAtIndex(0, mTMathAtom2.getNucleus()).getGid()) : 0.0f;
                        if (italicCorrection > MTTypesetterKt.kLineSkipLimitMultiplier && mTMathAtom2.getSubScript() == null) {
                            CGPoint cGPoint23 = this.currentPosition;
                            cGPoint23.setX(cGPoint23.getX() + italicCorrection);
                        }
                        makeScripts(mTMathAtom2, mTCTLineDisplayAddDisplayLine, mTMathAtom2.getIndexRange().getMaxrange() - 1, italicCorrection);
                    }
                    break;
                default:
                    wg6.i();
                    return;
            }
            type = mTMathAtom2.getType();
            mTMathAtom = mTMathAtom2;
        }
        if (this.currentLine.length() > 0) {
            addDisplayLine();
        }
        if (!this.spaced || type == MTMathAtomType.KMTMathAtomNone) {
            return;
        }
        MTDisplay mTDisplay2 = (MTDisplay) w44.U0(this.displayAtoms);
        mTDisplay2.setWidth(mTDisplay2.getWidth() + getInterElementSpace(type, MTMathAtomType.KMTMathAtomClose));
    }

    private final CGGlyph findGlyph(CGGlyph glyph, float height) {
        float bboxDetailsAscent;
        List<Integer> verticalVariantsForGlyph = this.styleFont.getMathTable().getVerticalVariantsForGlyph(glyph);
        int size = verticalVariantsForGlyph.size();
        BoundingBox[] boundingBoxArr = new BoundingBox[size];
        Float[] fArr = new Float[size];
        int i = 0;
        while (true) {
            bboxDetailsAscent = MTTypesetterKt.kLineSkipLimitMultiplier;
            if (i >= size) {
                break;
            }
            fArr[i] = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
            i++;
        }
        this.styleFont.getMathTable().getBoundingRectsForGlyphs(verticalVariantsForGlyph, boundingBoxArr, size);
        this.styleFont.getMathTable().getAdvancesForGlyphs(verticalVariantsForGlyph, fArr, size);
        float bboxDetailsDescent = 0.0f;
        float fFloatValue = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            BoundingBox boundingBox = boundingBoxArr[i2];
            fFloatValue = fArr[i2].floatValue();
            bboxDetailsAscent = getBboxDetailsAscent(boundingBox);
            bboxDetailsDescent = getBboxDetailsDescent(boundingBox);
            if (bboxDetailsAscent + bboxDetailsDescent >= height) {
                return new CGGlyph(verticalVariantsForGlyph.get(i2).intValue(), bboxDetailsAscent, bboxDetailsDescent, fFloatValue);
            }
        }
        return new CGGlyph(verticalVariantsForGlyph.get(size - 1).intValue(), bboxDetailsAscent, bboxDetailsDescent, fFloatValue);
    }

    private final MTDisplay findGlyphForBoundary(String delimiter, float glyphHeight) {
        CGGlyph cGGlyphFindGlyphForCharacterAtIndex = this.styleFont.findGlyphForCharacterAtIndex(0, delimiter);
        CGGlyph cGGlyphFindGlyph = findGlyph(cGGlyphFindGlyphForCharacterAtIndex, glyphHeight);
        MTDisplay mTDisplayConstructGlyph = cGGlyphFindGlyph.getGlyphDescent() + cGGlyphFindGlyph.getGlyphAscent() < glyphHeight ? constructGlyph(cGGlyphFindGlyphForCharacterAtIndex, glyphHeight) : null;
        if (mTDisplayConstructGlyph == null) {
            mTDisplayConstructGlyph = new MTGlyphDisplay(cGGlyphFindGlyph, new NSRange(-1, 0), this.styleFont);
            mTDisplayConstructGlyph.setAscent(cGGlyphFindGlyph.getGlyphAscent());
            mTDisplayConstructGlyph.setDescent(cGGlyphFindGlyph.getGlyphDescent());
            mTDisplayConstructGlyph.setWidth(cGGlyphFindGlyph.getGlyphWidth());
        }
        mTDisplayConstructGlyph.setShiftDown(((mTDisplayConstructGlyph.getAscent() - mTDisplayConstructGlyph.getDescent()) * 0.5f) - this.styleFont.getMathTable().getAxisHeight());
        return mTDisplayConstructGlyph;
    }

    private final CGGlyph findVariantGlyph(CGGlyph glyph, float maxWidth) {
        List<Integer> horizontalVariantsForGlyph = this.styleFont.getMathTable().getHorizontalVariantsForGlyph(glyph);
        int size = horizontalVariantsForGlyph.size();
        BoundingBox[] boundingBoxArr = new BoundingBox[size];
        Float[] fArr = new Float[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            fArr[i2] = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        this.styleFont.getMathTable().getBoundingRectsForGlyphs(horizontalVariantsForGlyph, boundingBoxArr, size);
        this.styleFont.getMathTable().getAdvancesForGlyphs(horizontalVariantsForGlyph, fArr, size);
        CGGlyph cGGlyph = new CGGlyph(0, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 15, null);
        while (true) {
            if (i >= size) {
                break;
            }
            BoundingBox boundingBox = boundingBoxArr[i];
            if (boundingBox != null) {
                float bboxDetailsAscent = getBboxDetailsAscent(boundingBox);
                float bboxDetailsDescent = getBboxDetailsDescent(boundingBox);
                if (Math.max(boundingBox.getLowerLeftX(), boundingBox.getUpperRightX()) <= maxWidth) {
                    cGGlyph.setGid(horizontalVariantsForGlyph.get(i).intValue());
                    cGGlyph.setGlyphWidth(fArr[i].floatValue());
                    cGGlyph.setGlyphAscent(bboxDetailsAscent);
                    cGGlyph.setGlyphDescent(bboxDetailsDescent);
                } else if (i == 0) {
                    cGGlyph.setGlyphWidth(fArr[i].floatValue());
                    cGGlyph.setGlyphAscent(bboxDetailsAscent);
                    cGGlyph.setGlyphDescent(bboxDetailsDescent);
                    return cGGlyph;
                }
            }
            i++;
        }
        return cGGlyph;
    }

    private final MTLineStyle fractionStyle() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i == 1) {
            return MTLineStyle.KMTLineStyleText;
        }
        if (i == 2) {
            return MTLineStyle.KMTLineStyleScript;
        }
        if (i == 3 || i == 4) {
            return MTLineStyle.KMTLineStyleScriptScript;
        }
        wg6.i();
        return null;
    }

    private final float getBboxDetailsAscent(BoundingBox bbox) {
        return bbox == null ? MTTypesetterKt.kLineSkipLimitMultiplier : Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Math.max(bbox.getUpperRightY(), bbox.getLowerLeftY()));
    }

    private final float getBboxDetailsDescent(BoundingBox bbox) {
        return bbox == null ? MTTypesetterKt.kLineSkipLimitMultiplier : Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier - Math.min(bbox.getUpperRightY(), bbox.getLowerLeftY()));
    }

    private final float getInterElementSpace(MTMathAtomType left, MTMathAtomType right) {
        MTInterElementSpaceType mTInterElementSpaceType = MTSpacingKt.getInterElementSpaceArray()[MTSpacingKt.getInterElementSpaceArrayIndexForType(left, true)][MTSpacingKt.getInterElementSpaceArrayIndexForType(right, false)];
        if (mTInterElementSpaceType != MTInterElementSpaceType.KMTSpaceInvalid) {
            int spacingInMu = getSpacingInMu(mTInterElementSpaceType);
            if (spacingInMu <= 0) {
                return MTTypesetterKt.kLineSkipLimitMultiplier;
            }
            return this.styleFont.getMathTable().muUnit() * spacingInMu;
        }
        MathDisplayLogger.INSTANCE.warn$mathdisplaylib("Invalid inter-element space between " + left + " and " + right + ", falling back to zero spacing");
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    private final MTDisplay getRadicalGlyphWithHeight(float radicalHeight) {
        CGGlyph cGGlyphFindGlyphForCharacterAtIndex = this.styleFont.findGlyphForCharacterAtIndex(0, "√");
        CGGlyph cGGlyphFindGlyph = findGlyph(cGGlyphFindGlyphForCharacterAtIndex, radicalHeight);
        MTGlyphConstructionDisplay mTGlyphConstructionDisplayConstructGlyph = cGGlyphFindGlyph.getGlyphDescent() + cGGlyphFindGlyph.getGlyphAscent() < radicalHeight ? constructGlyph(cGGlyphFindGlyphForCharacterAtIndex, radicalHeight) : null;
        if (mTGlyphConstructionDisplayConstructGlyph != null) {
            return mTGlyphConstructionDisplayConstructGlyph;
        }
        MTGlyphDisplay mTGlyphDisplay = new MTGlyphDisplay(cGGlyphFindGlyph, new NSRange(-1, 0), this.styleFont);
        mTGlyphDisplay.setAscent(cGGlyphFindGlyph.getGlyphAscent());
        mTGlyphDisplay.setDescent(cGGlyphFindGlyph.getGlyphDescent());
        mTGlyphDisplay.setWidth(cGGlyphFindGlyph.getGlyphWidth());
        return mTGlyphDisplay;
    }

    private final float getSkew(MTAccent accent, float accenteeWidth, CGGlyph accentGlyph) {
        int length = accent.getNucleus().length();
        float topAccentAdjustment = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (length == 0) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        float topAccentAdjustment2 = this.styleFont.getMathTable().getTopAccentAdjustment(accentGlyph.getGid());
        if (!isSingleCharAccentee(accent)) {
            topAccentAdjustment = accenteeWidth / 2.0f;
        } else if (accent.getInnerList() != null) {
            MTMathList innerList = accent.getInnerList();
            innerList.getClass();
            topAccentAdjustment = this.styleFont.getMathTable().getTopAccentAdjustment(this.styleFont.findGlyphForCharacterAtIndex(0, innerList.getAtoms().get(0).getNucleus()).getGid());
        }
        return topAccentAdjustment - topAccentAdjustment2;
    }

    private final int getSpacingInMu(MTInterElementSpaceType type) {
        switch (WhenMappings.$EnumSwitchMapping$2[type.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (this.style.compareTo(MTLineStyle.KMTLineStyleScript) < 0) {
                }
                break;
            case 5:
                if (this.style.compareTo(MTLineStyle.KMTLineStyleScript) < 0) {
                }
                break;
            case 6:
                if (this.style.compareTo(MTLineStyle.KMTLineStyleScript) < 0) {
                }
                break;
            default:
                wg6.i();
                break;
        }
        return 0;
    }

    private final float getStyleSize(MTLineStyle style, MTFont font) {
        float scriptScaleDown;
        float fontSize = font.getFontSize();
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i == 1 || i == 2) {
            return fontSize;
        }
        if (i == 3) {
            scriptScaleDown = font.getMathTable().getScriptScaleDown();
        } else {
            if (i != 4) {
                wg6.i();
                return MTTypesetterKt.kLineSkipLimitMultiplier;
            }
            scriptScaleDown = font.getMathTable().getScriptScriptScaleDown();
        }
        return scriptScaleDown * fontSize;
    }

    private final boolean isSingleCharAccentee(MTAccent accent) {
        if (accent.getInnerList() != null) {
            MTMathList innerList = accent.getInnerList();
            innerList.getClass();
            if (innerList.getAtoms().size() != 1) {
                return false;
            }
            MTMathList innerList2 = accent.getInnerList();
            innerList2.getClass();
            MTMathAtom mTMathAtom = innerList2.getAtoms().get(0);
            if (MTCharsetKt.numberOfGlyphs(mTMathAtom.getNucleus()) == 1 && mTMathAtom.getSubScript() == null && mTMathAtom.getSuperScript() == null) {
                return true;
            }
        }
        return false;
    }

    private final MTDisplay makeAccent(MTAccent accent) throws MathDisplayException {
        if (accent.getInnerList() == null) {
            return null;
        }
        Companion companion = INSTANCE;
        MTMathList innerList = accent.getInnerList();
        innerList.getClass();
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(innerList, this.font, this.style, true);
        if (accent.getNucleus().length() == 0) {
            return mTMathListDisplayCreateLineForMathList;
        }
        CGGlyph cGGlyphFindGlyphForCharacterAtIndex = this.styleFont.findGlyphForCharacterAtIndex(0, accent.getNucleus());
        float width = mTMathListDisplayCreateLineForMathList.getWidth();
        CGGlyph cGGlyphFindVariantGlyph = findVariantGlyph(cGGlyphFindGlyphForCharacterAtIndex, width);
        float fMin = Math.min(mTMathListDisplayCreateLineForMathList.getAscent(), this.styleFont.getMathTable().getAccentBaseHeight());
        CGPoint cGPoint = new CGPoint(getSkew(accent, width, cGGlyphFindVariantGlyph), mTMathListDisplayCreateLineForMathList.getAscent() - fMin);
        MTGlyphDisplay mTGlyphDisplay = new MTGlyphDisplay(cGGlyphFindVariantGlyph, accent.getIndexRange(), this.styleFont);
        mTGlyphDisplay.setAscent(cGGlyphFindVariantGlyph.getGlyphAscent());
        mTGlyphDisplay.setDescent(cGGlyphFindVariantGlyph.getGlyphDescent());
        mTGlyphDisplay.setWidth(cGGlyphFindVariantGlyph.getGlyphWidth());
        mTGlyphDisplay.setPosition(cGPoint);
        if (isSingleCharAccentee(accent) && (accent.getSubScript() != null || accent.getSuperScript() != null)) {
            MTMathList innerList2 = accent.getInnerList();
            innerList2.getClass();
            MTMathAtom mTMathAtom = innerList2.getAtoms().get(0);
            mTMathAtom.setSuperScript(accent.getSuperScript());
            mTMathAtom.setSubScript(accent.getSubScript());
            accent.setSuperScript(null);
            accent.setSubScript(null);
            MTMathList innerList3 = accent.getInnerList();
            innerList3.getClass();
            mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(innerList3, this.font, this.style, this.cramped);
        }
        MTAccentDisplay mTAccentDisplay = new MTAccentDisplay(mTGlyphDisplay, mTMathListDisplayCreateLineForMathList, accent.getIndexRange());
        mTAccentDisplay.setWidth(mTMathListDisplayCreateLineForMathList.getWidth());
        mTAccentDisplay.setDescent(mTMathListDisplayCreateLineForMathList.getDescent());
        mTAccentDisplay.setAscent(Math.max(mTMathListDisplayCreateLineForMathList.getAscent(), cGGlyphFindVariantGlyph.getGlyphAscent() + (mTMathListDisplayCreateLineForMathList.getAscent() - fMin)));
        mTAccentDisplay.setPosition(this.currentPosition);
        return mTAccentDisplay;
    }

    private final MTDisplay makeBoxed(MTBoxed boxed) {
        MTMathList innerList = boxed.getInnerList();
        if (innerList == null) {
            return null;
        }
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = INSTANCE.createLineForMathList(innerList, this.font, this.style, this.cramped);
        float fractionRuleThickness = this.styleFont.getMathTable().getFractionRuleThickness();
        float fontSize = (this.styleFont.getFontSize() * 0.3f) + fractionRuleThickness;
        MTBoxedDisplay mTBoxedDisplay = new MTBoxedDisplay(mTMathListDisplayCreateLineForMathList, boxed.getIndexRange());
        mTBoxedDisplay.setLineThickness(fractionRuleThickness);
        mTBoxedDisplay.setPadding(fontSize);
        mTBoxedDisplay.setAscent(mTMathListDisplayCreateLineForMathList.getAscent() + fontSize);
        mTBoxedDisplay.setDescent(mTMathListDisplayCreateLineForMathList.getDescent() + fontSize);
        mTBoxedDisplay.setWidth((2.0f * fontSize) + mTMathListDisplayCreateLineForMathList.getWidth());
        mTBoxedDisplay.setPosition(this.currentPosition);
        return mTBoxedDisplay;
    }

    private final MTDisplay makeCancel(MTCancel cancel) {
        MTMathList innerList = cancel.getInnerList();
        if (innerList == null) {
            return null;
        }
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = INSTANCE.createLineForMathList(innerList, this.font, this.style, this.cramped);
        MTCancelDisplay mTCancelDisplay = new MTCancelDisplay(mTMathListDisplayCreateLineForMathList, cancel.getIndexRange());
        mTCancelDisplay.setCancelStyle(cancel.getCancelStyle());
        mTCancelDisplay.setLineThickness(this.styleFont.getMathTable().getFractionRuleThickness());
        float fontSize = this.styleFont.getFontSize() / 10.0f;
        mTCancelDisplay.setOverhang(fontSize);
        mTCancelDisplay.setAscent(mTMathListDisplayCreateLineForMathList.getAscent());
        mTCancelDisplay.setDescent(mTMathListDisplayCreateLineForMathList.getDescent());
        mTCancelDisplay.setWidth((2.0f * fontSize) + mTMathListDisplayCreateLineForMathList.getWidth());
        mTCancelDisplay.setPosition(this.currentPosition);
        return mTCancelDisplay;
    }

    private final MTDisplay makeFraction(MTFraction frac) {
        MTLineStyle mTLineStyleFractionStyle = frac.getIsContinuedFraction() ? MTLineStyle.KMTLineStyleDisplay : fractionStyle();
        Companion companion = INSTANCE;
        MTMathList numerator = frac.getNumerator();
        numerator.getClass();
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(numerator, this.font, mTLineStyleFractionStyle, false);
        MTMathList denominator = frac.getDenominator();
        denominator.getClass();
        MTMathListDisplay mTMathListDisplayCreateLineForMathList2 = companion.createLineForMathList(denominator, this.font, mTLineStyleFractionStyle, true);
        float fNumeratorShiftUp = numeratorShiftUp(frac.getHasRule());
        float fDenominatorShiftDown = denominatorShiftDown(frac.getHasRule());
        float axisHeight = this.styleFont.getMathTable().getAxisHeight();
        float fractionRuleThickness = frac.getHasRule() ? this.styleFont.getMathTable().getFractionRuleThickness() : MTTypesetterKt.kLineSkipLimitMultiplier;
        if (frac.getHasRule()) {
            float f = fractionRuleThickness / 2.0f;
            float descent = (fNumeratorShiftUp - mTMathListDisplayCreateLineForMathList.getDescent()) - (axisHeight + f);
            float fNumeratorGapMin = numeratorGapMin();
            if (descent < fNumeratorGapMin) {
                fNumeratorShiftUp += fNumeratorGapMin - descent;
            }
            float ascent = (axisHeight - f) - (mTMathListDisplayCreateLineForMathList2.getAscent() - fDenominatorShiftDown);
            float fDenominatorGapMin = denominatorGapMin();
            if (ascent < fDenominatorGapMin) {
                fDenominatorShiftDown += fDenominatorGapMin - ascent;
            }
        } else {
            float descent2 = (fNumeratorShiftUp - mTMathListDisplayCreateLineForMathList.getDescent()) - (mTMathListDisplayCreateLineForMathList2.getAscent() - fDenominatorShiftDown);
            float fStackGapMin = stackGapMin();
            if (descent2 < fStackGapMin) {
                float f2 = (fStackGapMin - descent2) / 2.0f;
                fNumeratorShiftUp += f2;
                fDenominatorShiftDown += f2;
            }
        }
        MTFractionDisplay mTFractionDisplay = new MTFractionDisplay(mTMathListDisplayCreateLineForMathList, mTMathListDisplayCreateLineForMathList2, frac.getIndexRange());
        mTFractionDisplay.setNumeratorAlignment(frac.getAlignment());
        mTFractionDisplay.setPosition(this.currentPosition);
        mTFractionDisplay.setNumeratorUp(fNumeratorShiftUp);
        mTFractionDisplay.setDenominatorDown(fDenominatorShiftDown);
        mTFractionDisplay.setLineThickness(fractionRuleThickness);
        mTFractionDisplay.setLinePosition(axisHeight);
        return (frac.getLeftDelimiter() == null && frac.getRightDelimiter() == null) ? mTFractionDisplay : addDelimitersToFractionDisplay(mTFractionDisplay, frac);
    }

    private final MTDisplay makeLargeOp(MTLargeOperator op) {
        boolean z = op.getHasLimits() && this.style == MTLineStyle.KMTLineStyleDisplay;
        if (op.getNucleus().length() != 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(op);
            MTCTLineDisplay mTCTLineDisplay = new MTCTLineDisplay(op.getNucleus(), op.getIndexRange(), this.styleFont, arrayList);
            mTCTLineDisplay.setPosition(this.currentPosition);
            return addLimitsToDisplay(mTCTLineDisplay, op, MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        CGGlyph cGGlyphFindGlyphForCharacterAtIndex = this.styleFont.findGlyphForCharacterAtIndex(0, op.getNucleus());
        if (this.style == MTLineStyle.KMTLineStyleDisplay && cGGlyphFindGlyphForCharacterAtIndex.isValid()) {
            cGGlyphFindGlyphForCharacterAtIndex = new CGGlyph(this.styleFont.getMathTable().getLargerGlyph(cGGlyphFindGlyphForCharacterAtIndex.getGid()), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14, null);
        }
        float italicCorrection = this.styleFont.getMathTable().getItalicCorrection(cGGlyphFindGlyphForCharacterAtIndex.getGid());
        BoundingBox[] boundingBoxArr = new BoundingBox[1];
        Float[] fArr = {Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier)};
        List<Integer> listW = x44.W(Integer.valueOf(cGGlyphFindGlyphForCharacterAtIndex.getGid()));
        List<Integer> list = listW;
        this.styleFont.getMathTable().getBoundingRectsForGlyphs(listW, boundingBoxArr, list.size());
        this.styleFont.getMathTable().getAdvancesForGlyphs(listW, fArr, list.size());
        float bboxDetailsAscent = getBboxDetailsAscent(boundingBoxArr[0]);
        float bboxDetailsDescent = getBboxDetailsDescent(boundingBoxArr[0]);
        float axisHeight = ((bboxDetailsAscent - bboxDetailsDescent) * 0.5f) - this.styleFont.getMathTable().getAxisHeight();
        MTGlyphDisplay mTGlyphDisplay = new MTGlyphDisplay(cGGlyphFindGlyphForCharacterAtIndex, op.getIndexRange(), this.styleFont);
        mTGlyphDisplay.setAscent(bboxDetailsAscent);
        mTGlyphDisplay.setDescent(bboxDetailsDescent);
        mTGlyphDisplay.setWidth(fArr[0].floatValue());
        if (op.getSubScript() != null && !z) {
            mTGlyphDisplay.setWidth(mTGlyphDisplay.getWidth() - italicCorrection);
        }
        mTGlyphDisplay.setShiftDown(axisHeight);
        mTGlyphDisplay.setPosition(this.currentPosition);
        return addLimitsToDisplay(mTGlyphDisplay, op, italicCorrection);
    }

    private final MTDisplay makeLeftRight(MTInner inner) throws MathDisplayException {
        float fMax;
        if (inner.getLeftBoundary() == null) {
            inner.getRightBoundary();
        }
        Companion companion = INSTANCE;
        MTMathList innerList = inner.getInnerList();
        innerList.getClass();
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(innerList, this.font, this.style, this.cramped, true);
        float axisHeight = this.styleFont.getMathTable().getAxisHeight();
        float fMax2 = Math.max(mTMathListDisplayCreateLineForMathList.getAscent() - axisHeight, mTMathListDisplayCreateLineForMathList.getDescent() + axisHeight);
        float f = (fMax2 / 500.0f) * 901.0f;
        float f2 = (fMax2 * 2.0f) - 5.0f;
        Float delimiterHeight = inner.getDelimiterHeight();
        if (delimiterHeight != null) {
            fMax = this.styleFont.getFontSize() * delimiterHeight.floatValue();
        } else {
            fMax = Math.max(f, f2);
        }
        ArrayList arrayList = new ArrayList();
        CGPoint cGPoint = new CGPoint(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null);
        MTMathAtom leftBoundary = inner.getLeftBoundary();
        if (leftBoundary != null && leftBoundary.getNucleus().length() > 0) {
            MTDisplay mTDisplayFindGlyphForBoundary = findGlyphForBoundary(leftBoundary.getNucleus(), fMax);
            mTDisplayFindGlyphForBoundary.setPosition(CGPoint.copy$default(cGPoint, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null));
            cGPoint.setX(mTDisplayFindGlyphForBoundary.getWidth() + cGPoint.getX());
            arrayList.add(mTDisplayFindGlyphForBoundary);
        }
        mTMathListDisplayCreateLineForMathList.setPosition(CGPoint.copy$default(cGPoint, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null));
        cGPoint.setX(mTMathListDisplayCreateLineForMathList.getWidth() + cGPoint.getX());
        arrayList.add(mTMathListDisplayCreateLineForMathList);
        MTMathAtom rightBoundary = inner.getRightBoundary();
        if (rightBoundary != null && rightBoundary.getNucleus().length() > 0) {
            MTDisplay mTDisplayFindGlyphForBoundary2 = findGlyphForBoundary(rightBoundary.getNucleus(), fMax);
            mTDisplayFindGlyphForBoundary2.setPosition(CGPoint.copy$default(cGPoint, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null));
            cGPoint.setX(mTDisplayFindGlyphForBoundary2.getWidth() + cGPoint.getX());
            arrayList.add(mTDisplayFindGlyphForBoundary2);
        }
        return new MTMathListDisplay(arrayList, inner.getIndexRange());
    }

    private final MTDisplay makeOverLeftArrow(MTOverLeftArrow over) {
        if (over.getInnerList() == null) {
            return null;
        }
        Companion companion = INSTANCE;
        MTMathList innerList = over.getInnerList();
        innerList.getClass();
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(innerList, this.font, this.style, this.cramped);
        MTArrowLineDisplay mTArrowLineDisplay = new MTArrowLineDisplay(mTMathListDisplayCreateLineForMathList, over.getIndexRange(), MTArrowDirection.LEFT);
        mTArrowLineDisplay.setLineShiftUp(this.styleFont.getMathTable().getOverbarVerticalGap() + mTMathListDisplayCreateLineForMathList.getAscent());
        mTArrowLineDisplay.setLineThickness(this.styleFont.getMathTable().getUnderbarRuleThickness());
        mTArrowLineDisplay.setAscent(this.styleFont.getMathTable().getOverbarExtraAscender() + this.styleFont.getMathTable().getOverbarRuleThickness() + this.styleFont.getMathTable().getOverbarVerticalGap() + mTMathListDisplayCreateLineForMathList.getAscent());
        mTArrowLineDisplay.setDescent(mTMathListDisplayCreateLineForMathList.getDescent());
        mTArrowLineDisplay.setWidth(mTMathListDisplayCreateLineForMathList.getWidth());
        mTArrowLineDisplay.setPosition(this.currentPosition);
        return mTArrowLineDisplay;
    }

    private final MTDisplay makeOverLeftRightArrow(MTOverLeftRightArrow over) {
        if (over.getInnerList() == null) {
            return null;
        }
        Companion companion = INSTANCE;
        MTMathList innerList = over.getInnerList();
        innerList.getClass();
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(innerList, this.font, this.style, this.cramped);
        MTArrowLineDisplay mTArrowLineDisplay = new MTArrowLineDisplay(mTMathListDisplayCreateLineForMathList, over.getIndexRange(), MTArrowDirection.BOTH);
        mTArrowLineDisplay.setLineShiftUp(this.styleFont.getMathTable().getOverbarVerticalGap() + mTMathListDisplayCreateLineForMathList.getAscent());
        mTArrowLineDisplay.setLineThickness(this.styleFont.getMathTable().getUnderbarRuleThickness());
        mTArrowLineDisplay.setAscent(this.styleFont.getMathTable().getOverbarExtraAscender() + this.styleFont.getMathTable().getOverbarRuleThickness() + this.styleFont.getMathTable().getOverbarVerticalGap() + mTMathListDisplayCreateLineForMathList.getAscent());
        mTArrowLineDisplay.setDescent(mTMathListDisplayCreateLineForMathList.getDescent());
        mTArrowLineDisplay.setWidth(mTMathListDisplayCreateLineForMathList.getWidth());
        mTArrowLineDisplay.setPosition(this.currentPosition);
        return mTArrowLineDisplay;
    }

    private final MTDisplay makeOverRightArrow(MTOverRightArrow over) {
        if (over.getInnerList() == null) {
            return null;
        }
        Companion companion = INSTANCE;
        MTMathList innerList = over.getInnerList();
        innerList.getClass();
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(innerList, this.font, this.style, this.cramped);
        MTArrowLineDisplay mTArrowLineDisplay = new MTArrowLineDisplay(mTMathListDisplayCreateLineForMathList, over.getIndexRange(), MTArrowDirection.RIGHT);
        mTArrowLineDisplay.setLineShiftUp(this.styleFont.getMathTable().getOverbarVerticalGap() + mTMathListDisplayCreateLineForMathList.getAscent());
        mTArrowLineDisplay.setLineThickness(this.styleFont.getMathTable().getUnderbarRuleThickness());
        mTArrowLineDisplay.setAscent(this.styleFont.getMathTable().getOverbarExtraAscender() + this.styleFont.getMathTable().getOverbarRuleThickness() + this.styleFont.getMathTable().getOverbarVerticalGap() + mTMathListDisplayCreateLineForMathList.getAscent());
        mTArrowLineDisplay.setDescent(mTMathListDisplayCreateLineForMathList.getDescent());
        mTArrowLineDisplay.setWidth(mTMathListDisplayCreateLineForMathList.getWidth());
        mTArrowLineDisplay.setPosition(this.currentPosition);
        return mTArrowLineDisplay;
    }

    private final MTDisplay makeOverline(MTOverLine over) {
        if (over.getInnerList() == null) {
            return null;
        }
        Companion companion = INSTANCE;
        MTMathList innerList = over.getInnerList();
        innerList.getClass();
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(innerList, this.font, this.style, this.cramped);
        MTLineDisplay mTLineDisplay = new MTLineDisplay(mTMathListDisplayCreateLineForMathList, over.getIndexRange());
        mTLineDisplay.setLineShiftUp(this.styleFont.getMathTable().getOverbarVerticalGap() + mTMathListDisplayCreateLineForMathList.getAscent());
        mTLineDisplay.setLineThickness(this.styleFont.getMathTable().getUnderbarRuleThickness());
        mTLineDisplay.setAscent(this.styleFont.getMathTable().getOverbarExtraAscender() + this.styleFont.getMathTable().getOverbarRuleThickness() + this.styleFont.getMathTable().getOverbarVerticalGap() + mTMathListDisplayCreateLineForMathList.getAscent());
        mTLineDisplay.setDescent(mTMathListDisplayCreateLineForMathList.getDescent());
        mTLineDisplay.setWidth(mTMathListDisplayCreateLineForMathList.getWidth());
        mTLineDisplay.setPosition(this.currentPosition);
        return mTLineDisplay;
    }

    private final MTDisplay makePhantom(MTPhantom phantom) {
        MTMathList innerList = phantom.getInnerList();
        if (innerList == null) {
            return null;
        }
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = INSTANCE.createLineForMathList(innerList, this.font, this.style, this.cramped);
        MTPhantomDisplay mTPhantomDisplay = new MTPhantomDisplay(phantom.getIndexRange());
        int i = WhenMappings.$EnumSwitchMapping$3[phantom.getMode().ordinal()];
        if (i == 1) {
            mTPhantomDisplay.setAscent(mTMathListDisplayCreateLineForMathList.getAscent());
            mTPhantomDisplay.setDescent(mTMathListDisplayCreateLineForMathList.getDescent());
            mTPhantomDisplay.setWidth(mTMathListDisplayCreateLineForMathList.getWidth());
        } else if (i == 2) {
            mTPhantomDisplay.setAscent(MTTypesetterKt.kLineSkipLimitMultiplier);
            mTPhantomDisplay.setDescent(MTTypesetterKt.kLineSkipLimitMultiplier);
            mTPhantomDisplay.setWidth(mTMathListDisplayCreateLineForMathList.getWidth());
        } else {
            if (i != 3) {
                wg6.i();
                return null;
            }
            mTPhantomDisplay.setAscent(mTMathListDisplayCreateLineForMathList.getAscent());
            mTPhantomDisplay.setDescent(mTMathListDisplayCreateLineForMathList.getDescent());
            mTPhantomDisplay.setWidth(MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        mTPhantomDisplay.setPosition(this.currentPosition);
        return mTPhantomDisplay;
    }

    private final MTRadicalDisplay makeRadical(MTMathList radicand, NSRange range) {
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = INSTANCE.createLineForMathList(radicand, this.font, this.style, true);
        float fRadicalVerticalGap = radicalVerticalGap();
        float radicalRuleThickness = this.styleFont.getMathTable().getRadicalRuleThickness();
        MTDisplay radicalGlyphWithHeight = getRadicalGlyphWithHeight(mTMathListDisplayCreateLineForMathList.getDescent() + mTMathListDisplayCreateLineForMathList.getAscent() + fRadicalVerticalGap + radicalRuleThickness);
        float ascent = (radicalGlyphWithHeight.getAscent() + radicalGlyphWithHeight.getDescent()) - (((mTMathListDisplayCreateLineForMathList.getDescent() + mTMathListDisplayCreateLineForMathList.getAscent()) + fRadicalVerticalGap) + radicalRuleThickness);
        if (ascent > MTTypesetterKt.kLineSkipLimitMultiplier) {
            fRadicalVerticalGap += ascent / 2.0f;
        }
        float ascent2 = mTMathListDisplayCreateLineForMathList.getAscent() + fRadicalVerticalGap + radicalRuleThickness;
        radicalGlyphWithHeight.setShiftDown(-(ascent2 - radicalGlyphWithHeight.getAscent()));
        MTRadicalDisplay mTRadicalDisplay = new MTRadicalDisplay(mTMathListDisplayCreateLineForMathList, radicalGlyphWithHeight, range);
        mTRadicalDisplay.setPosition(this.currentPosition);
        mTRadicalDisplay.setAscent(this.styleFont.getMathTable().getRadicalExtraAscender() + ascent2);
        mTRadicalDisplay.setTopKern(this.styleFont.getMathTable().getRadicalExtraAscender());
        mTRadicalDisplay.setLineThickness(radicalRuleThickness);
        mTRadicalDisplay.setDescent(Math.max((radicalGlyphWithHeight.getDescent() + radicalGlyphWithHeight.getAscent()) - ascent2, mTMathListDisplayCreateLineForMathList.getDescent()));
        mTRadicalDisplay.setWidth(mTMathListDisplayCreateLineForMathList.getWidth() + radicalGlyphWithHeight.getWidth());
        return mTRadicalDisplay;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.agog.mathdisplay.render.MTMathListDisplay makeRowWithColumns(com.agog.mathdisplay.render.MTDisplay[] r16, com.agog.mathdisplay.parse.MTMathTable r17, java.lang.Float[] r18) {
        /*
            r15 = this;
            r0 = r16
            com.agog.mathdisplay.parse.NSRange r1 = new com.agog.mathdisplay.parse.NSRange
            r2 = 0
            r3 = 3
            r4 = 0
            r1.<init>(r2, r2, r3, r4)
            int r5 = r0.length
            r6 = 0
            r7 = r2
            r8 = r6
        Le:
            if (r7 >= r5) goto L7a
            r9 = r0[r7]
            r10 = r18[r7]
            float r10 = r10.floatValue()
            r11 = r17
            com.agog.mathdisplay.parse.MTColumnAlignment r12 = r11.getAlignmentForColumn(r7)
            int[] r13 = com.agog.mathdisplay.render.MTTypesetter.WhenMappings.$EnumSwitchMapping$4
            int r12 = r12.ordinal()
            r12 = r13[r12]
            r13 = 1
            if (r12 == r13) goto L3f
            r13 = 2
            if (r12 == r13) goto L34
            if (r12 != r3) goto L30
            r12 = r8
            goto L46
        L30:
            defpackage.wg6.i()
            return r4
        L34:
            float r12 = r9.getWidth()
            float r12 = r10 - r12
            r13 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r13
        L3d:
            float r12 = r12 + r8
            goto L46
        L3f:
            float r12 = r9.getWidth()
            float r12 = r10 - r12
            goto L3d
        L46:
            int r13 = r1.getLocation()
            r14 = -1
            if (r13 == r14) goto L56
            com.agog.mathdisplay.parse.NSRange r13 = r9.getRange()
            com.agog.mathdisplay.parse.NSRange r1 = r1.union(r13)
            goto L5e
        L56:
            com.agog.mathdisplay.parse.NSRange r1 = r9.getRange()
            com.agog.mathdisplay.parse.NSRange r1 = com.agog.mathdisplay.parse.NSRange.copy$default(r1, r2, r2, r3, r4)
        L5e:
            com.agog.mathdisplay.render.CGPoint r13 = new com.agog.mathdisplay.render.CGPoint
            r13.<init>(r12, r6)
            r9.setPosition(r13)
            float r9 = r11.getInterColumnSpacing()
            com.agog.mathdisplay.render.MTFont r12 = r15.styleFont
            com.agog.mathdisplay.render.MTFontMathTable r12 = r12.getMathTable()
            float r12 = r12.muUnit()
            float r12 = r12 * r9
            float r12 = r12 + r10
            float r8 = r8 + r12
            int r7 = r7 + 1
            goto Le
        L7a:
            com.agog.mathdisplay.render.MTMathListDisplay r15 = new com.agog.mathdisplay.render.MTMathListDisplay
            java.util.List r0 = defpackage.mp0.Y0(r0)
            r15.<init>(r0, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.agog.mathdisplay.render.MTTypesetter.makeRowWithColumns(com.agog.mathdisplay.render.MTDisplay[], com.agog.mathdisplay.parse.MTMathTable, java.lang.Float[]):com.agog.mathdisplay.render.MTMathListDisplay");
    }

    private final void makeScripts(MTMathAtom atom, MTDisplay display, int index, float delta) {
        MTMathList subScript = atom.getSubScript();
        MTMathList superScript = atom.getSuperScript();
        display.setHasScript(true);
        MTFontMathTable mathTable = this.font.copyFontWithSize(getStyleSize(scriptStyle(), this.font)).getMathTable();
        float ascent = display.getAscent() - mathTable.getSuperscriptBaselineDropMax();
        float subscriptBaselineDropMin = mathTable.getSubscriptBaselineDropMin() + display.getDescent();
        if (superScript == null && subScript != null) {
            MTMathListDisplay mTMathListDisplayCreateLineForMathList = INSTANCE.createLineForMathList(subScript, this.font, scriptStyle(), subScriptCramped());
            mTMathListDisplayCreateLineForMathList.setType(MTLinePosition.KMTLinePositionSubscript);
            mTMathListDisplayCreateLineForMathList.setIndex(index);
            mTMathListDisplayCreateLineForMathList.setPosition(new CGPoint(this.currentPosition.getX(), this.currentPosition.getY() - Math.max(Math.max(subscriptBaselineDropMin, this.styleFont.getMathTable().getSubscriptShiftDown()), mTMathListDisplayCreateLineForMathList.getAscent() - this.styleFont.getMathTable().getSubscriptTopMax())));
            this.displayAtoms.add(mTMathListDisplayCreateLineForMathList);
            CGPoint cGPoint = this.currentPosition;
            cGPoint.setX(this.styleFont.getMathTable().getSpaceAfterScript() + mTMathListDisplayCreateLineForMathList.getWidth() + cGPoint.getX());
            return;
        }
        Companion companion = INSTANCE;
        superScript.getClass();
        MTMathListDisplay mTMathListDisplayCreateLineForMathList2 = companion.createLineForMathList(superScript, this.font, scriptStyle(), getCramped());
        mTMathListDisplayCreateLineForMathList2.setType(MTLinePosition.KMTLinePositionSuperscript);
        mTMathListDisplayCreateLineForMathList2.setIndex(index);
        float fMax = Math.max(Math.max(ascent, superScriptShiftUp()), this.styleFont.getMathTable().getSuperscriptBottomMin() + mTMathListDisplayCreateLineForMathList2.getDescent());
        if (subScript == null) {
            mTMathListDisplayCreateLineForMathList2.setPosition(new CGPoint(this.currentPosition.getX(), this.currentPosition.getY() + fMax));
            this.displayAtoms.add(mTMathListDisplayCreateLineForMathList2);
            CGPoint cGPoint2 = this.currentPosition;
            cGPoint2.setX(this.styleFont.getMathTable().getSpaceAfterScript() + mTMathListDisplayCreateLineForMathList2.getWidth() + cGPoint2.getX());
            return;
        }
        MTMathListDisplay mTMathListDisplayCreateLineForMathList3 = companion.createLineForMathList(subScript, this.font, scriptStyle(), subScriptCramped());
        mTMathListDisplayCreateLineForMathList3.setType(MTLinePosition.KMTLinePositionSubscript);
        mTMathListDisplayCreateLineForMathList3.setIndex(index);
        float fMax2 = Math.max(subscriptBaselineDropMin, this.styleFont.getMathTable().getSubscriptShiftDown());
        float ascent2 = (fMax2 - mTMathListDisplayCreateLineForMathList3.getAscent()) + (fMax - mTMathListDisplayCreateLineForMathList2.getDescent());
        if (ascent2 < this.styleFont.getMathTable().getSubSuperscriptGapMin()) {
            fMax2 += this.styleFont.getMathTable().getSubSuperscriptGapMin() - ascent2;
            float superscriptBottomMaxWithSubscript = this.styleFont.getMathTable().getSuperscriptBottomMaxWithSubscript() - (fMax - mTMathListDisplayCreateLineForMathList2.getDescent());
            if (superscriptBottomMaxWithSubscript > MTTypesetterKt.kLineSkipLimitMultiplier) {
                fMax += superscriptBottomMaxWithSubscript;
                fMax2 -= superscriptBottomMaxWithSubscript;
            }
        }
        mTMathListDisplayCreateLineForMathList2.setPosition(new CGPoint(this.currentPosition.getX() + delta, this.currentPosition.getY() + fMax));
        this.displayAtoms.add(mTMathListDisplayCreateLineForMathList2);
        mTMathListDisplayCreateLineForMathList3.setPosition(new CGPoint(this.currentPosition.getX(), this.currentPosition.getY() - fMax2));
        this.displayAtoms.add(mTMathListDisplayCreateLineForMathList3);
        CGPoint cGPoint3 = this.currentPosition;
        cGPoint3.setX(this.styleFont.getMathTable().getSpaceAfterScript() + Math.max(mTMathListDisplayCreateLineForMathList2.getWidth() + delta, mTMathListDisplayCreateLineForMathList3.getWidth()) + cGPoint3.getX());
    }

    private final MTDisplay makeTable(MTMathTable table) {
        int iNumColumns = table.numColumns();
        if (iNumColumns == 0 || table.numRows() == 0) {
            return new MTMathListDisplay(new ArrayList(0), table.getIndexRange());
        }
        Float[] fArr = new Float[iNumColumns];
        for (int i = 0; i < iNumColumns; i++) {
            fArr[i] = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        MTDisplay[][] mTDisplayArrTypesetCells = typesetCells(table, fArr);
        ArrayList arrayList = new ArrayList(0);
        for (MTDisplay[] mTDisplayArr : mTDisplayArrTypesetCells) {
            arrayList.add(makeRowWithColumns(mTDisplayArr, table, fArr));
        }
        positionRows(arrayList, table);
        MTMathListDisplay mTMathListDisplay = new MTMathListDisplay(arrayList, table.getIndexRange());
        mTMathListDisplay.setPosition(this.currentPosition);
        return mTMathListDisplay;
    }

    private final MTDisplay makeUnderOverBrace(MTUnderOverBrace brace) throws MathDisplayException {
        MTMathList subScript;
        MTMathList innerList = brace.getInnerList();
        if (innerList == null) {
            return null;
        }
        Companion companion = INSTANCE;
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(innerList, this.font, this.style, this.cramped);
        MTUnderOverBraceDisplay mTUnderOverBraceDisplay = new MTUnderOverBraceDisplay(brace.getIndexRange());
        CGGlyph cGGlyphFindGlyphForCharacterAtIndex = this.styleFont.findGlyphForCharacterAtIndex(0, brace.getIsOver() ? "⏞" : "⏟");
        if (!cGGlyphFindGlyphForCharacterAtIndex.isValid()) {
            mTMathListDisplayCreateLineForMathList.setPosition(this.currentPosition);
            return mTMathListDisplayCreateLineForMathList;
        }
        CGGlyph cGGlyphFindVariantGlyph = findVariantGlyph(cGGlyphFindGlyphForCharacterAtIndex, mTMathListDisplayCreateLineForMathList.getWidth());
        MTGlyphDisplay mTGlyphDisplay = new MTGlyphDisplay(cGGlyphFindVariantGlyph, brace.getIndexRange(), this.styleFont);
        mTGlyphDisplay.setAscent(cGGlyphFindVariantGlyph.getGlyphAscent());
        mTGlyphDisplay.setDescent(cGGlyphFindVariantGlyph.getGlyphDescent());
        mTGlyphDisplay.setWidth(cGGlyphFindVariantGlyph.getGlyphWidth());
        if (mTGlyphDisplay.getWidth() < mTMathListDisplayCreateLineForMathList.getWidth() && mTGlyphDisplay.getWidth() > MTTypesetterKt.kLineSkipLimitMultiplier) {
            mTGlyphDisplay.setScaleX(mTMathListDisplayCreateLineForMathList.getWidth() / mTGlyphDisplay.getWidth());
            mTGlyphDisplay.setWidth(mTMathListDisplayCreateLineForMathList.getWidth());
        }
        if (brace.getIsOver()) {
            subScript = brace.getSuperScript();
            brace.setSuperScript(null);
        } else {
            subScript = brace.getSubScript();
            brace.setSubScript(null);
        }
        MTMathListDisplay mTMathListDisplayCreateLineForMathList2 = subScript != null ? companion.createLineForMathList(subScript, this.font, scriptStyle(), true) : null;
        float fMax = Math.max(mTMathListDisplayCreateLineForMathList.getWidth(), Math.max(mTGlyphDisplay.getWidth(), mTMathListDisplayCreateLineForMathList2 != null ? mTMathListDisplayCreateLineForMathList2.getWidth() : 0.0f));
        float width = (fMax - mTMathListDisplayCreateLineForMathList.getWidth()) / 2.0f;
        float width2 = (fMax - mTGlyphDisplay.getWidth()) / 2.0f;
        boolean zIsOver = brace.getIsOver();
        MTFont mTFont = this.styleFont;
        if (zIsOver) {
            float glyphDescent = cGGlyphFindVariantGlyph.getGlyphDescent() + mTMathListDisplayCreateLineForMathList.getAscent() + mTFont.getMathTable().getOverbarVerticalGap();
            mTGlyphDisplay.setPosition(new CGPoint(width2, glyphDescent));
            float glyphAscent = cGGlyphFindVariantGlyph.getGlyphAscent() + glyphDescent;
            if (mTMathListDisplayCreateLineForMathList2 != null) {
                float width3 = (fMax - mTMathListDisplayCreateLineForMathList2.getWidth()) / 2.0f;
                float descent = mTMathListDisplayCreateLineForMathList2.getDescent() + this.styleFont.getMathTable().getUpperLimitGapMin() + glyphAscent;
                mTMathListDisplayCreateLineForMathList2.setPosition(new CGPoint(width3, descent));
                glyphAscent = descent + mTMathListDisplayCreateLineForMathList2.getAscent();
            }
            mTUnderOverBraceDisplay.setAscent(glyphAscent);
            mTUnderOverBraceDisplay.setDescent(mTMathListDisplayCreateLineForMathList.getDescent());
        } else {
            float f = -(cGGlyphFindVariantGlyph.getGlyphAscent() + mTMathListDisplayCreateLineForMathList.getDescent() + mTFont.getMathTable().getUnderbarVerticalGap());
            mTGlyphDisplay.setPosition(new CGPoint(width2, f));
            float glyphDescent2 = cGGlyphFindVariantGlyph.getGlyphDescent() + (-f);
            if (mTMathListDisplayCreateLineForMathList2 != null) {
                float width4 = (fMax - mTMathListDisplayCreateLineForMathList2.getWidth()) / 2.0f;
                float f2 = -(mTMathListDisplayCreateLineForMathList2.getAscent() + this.styleFont.getMathTable().getLowerLimitGapMin() + glyphDescent2);
                mTMathListDisplayCreateLineForMathList2.setPosition(new CGPoint(width4, f2));
                glyphDescent2 = mTMathListDisplayCreateLineForMathList2.getDescent() + (-f2);
            }
            mTUnderOverBraceDisplay.setAscent(mTMathListDisplayCreateLineForMathList.getAscent());
            mTUnderOverBraceDisplay.setDescent(glyphDescent2);
        }
        mTMathListDisplayCreateLineForMathList.setPosition(new CGPoint(width, MTTypesetterKt.kLineSkipLimitMultiplier));
        mTUnderOverBraceDisplay.setInner(mTMathListDisplayCreateLineForMathList);
        mTUnderOverBraceDisplay.setBrace(mTGlyphDisplay);
        mTUnderOverBraceDisplay.setLabel(mTMathListDisplayCreateLineForMathList2);
        mTUnderOverBraceDisplay.setWidth(fMax);
        mTUnderOverBraceDisplay.setPosition(this.currentPosition);
        return mTUnderOverBraceDisplay;
    }

    private final MTDisplay makeUnderline(MTUnderLine under) {
        if (under.getInnerList() == null) {
            return null;
        }
        Companion companion = INSTANCE;
        MTMathList innerList = under.getInnerList();
        innerList.getClass();
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(innerList, this.font, this.style, this.cramped);
        MTLineDisplay mTLineDisplay = new MTLineDisplay(mTMathListDisplayCreateLineForMathList, under.getIndexRange());
        mTLineDisplay.setLineShiftUp(-(this.styleFont.getMathTable().getUnderbarVerticalGap() + mTMathListDisplayCreateLineForMathList.getDescent()));
        mTLineDisplay.setLineThickness(this.styleFont.getMathTable().getUnderbarRuleThickness());
        mTLineDisplay.setAscent(mTMathListDisplayCreateLineForMathList.getAscent());
        mTLineDisplay.setDescent(this.styleFont.getMathTable().getUnderbarExtraDescender() + this.styleFont.getMathTable().getUnderbarRuleThickness() + this.styleFont.getMathTable().getUnderbarVerticalGap() + mTMathListDisplayCreateLineForMathList.getDescent());
        mTLineDisplay.setWidth(mTMathListDisplayCreateLineForMathList.getWidth());
        mTLineDisplay.setPosition(this.currentPosition);
        return mTLineDisplay;
    }

    private final void positionRows(List<MTDisplay> rows, MTMathTable table) {
        float fontSize = this.styleFont.getFontSize() * table.getInterRowAdditionalSpacing() * 0.3f;
        float fontSize2 = (this.styleFont.getFontSize() * 1.2f) + fontSize;
        float fontSize3 = (this.styleFont.getFontSize() * 0.1f) + fontSize;
        float fontSize4 = (this.styleFont.getFontSize() * MTTypesetterKt.kLineSkipLimitMultiplier) + fontSize;
        boolean z = true;
        float ascent = 0.0f;
        float descent = 0.0f;
        float ascent2 = 0.0f;
        for (MTDisplay mTDisplay : rows) {
            if (z) {
                mTDisplay.setPosition(new CGPoint(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null));
                ascent2 += mTDisplay.getAscent();
                z = false;
            } else {
                ascent -= fontSize2 - (mTDisplay.getAscent() + descent) < fontSize4 ? (mTDisplay.getAscent() + descent) + fontSize3 : fontSize2;
                mTDisplay.setPosition(new CGPoint(MTTypesetterKt.kLineSkipLimitMultiplier, ascent));
            }
            descent = mTDisplay.getDescent();
        }
        float axisHeight = ((ascent2 - ((-ascent) + descent)) * 0.5f) - this.styleFont.getMathTable().getAxisHeight();
        for (MTDisplay mTDisplay2 : rows) {
            mTDisplay2.setPosition(new CGPoint(mTDisplay2.getPosition().getX(), mTDisplay2.getPosition().getY() - axisHeight));
        }
    }

    private final float radicalVerticalGap() {
        MTLineStyle mTLineStyle = this.style;
        MTLineStyle mTLineStyle2 = MTLineStyle.KMTLineStyleDisplay;
        MTFont mTFont = this.styleFont;
        return mTLineStyle == mTLineStyle2 ? mTFont.getMathTable().getRadicalDisplayStyleVerticalGap() : mTFont.getMathTable().getRadicalVerticalGap();
    }

    private final MTLineStyle scriptStyle() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i == 1 || i == 2) {
            return MTLineStyle.KMTLineStyleScript;
        }
        if (i != 3 && i != 4) {
            wg6.i();
            return null;
        }
        return MTLineStyle.KMTLineStyleScriptScript;
    }

    private final boolean subScriptCramped() {
        return true;
    }

    /* JADX INFO: renamed from: superScriptCramped, reason: from getter */
    private final boolean getCramped() {
        return this.cramped;
    }

    private final float superScriptShiftUp() {
        boolean z = this.cramped;
        MTFont mTFont = this.styleFont;
        return z ? mTFont.getMathTable().getSuperscriptShiftUpCramped() : mTFont.getMathTable().getSuperscriptShiftUp();
    }

    private final MTDisplay[][] typesetCells(MTMathTable table, Float[] columnWidths) {
        int iNumRows = table.numRows();
        MTDisplay[][] mTDisplayArr = new MTDisplay[iNumRows][];
        for (int i = 0; i < iNumRows; i++) {
            mTDisplayArr[i] = new MTDisplay[0];
        }
        int iNumRows2 = table.numRows();
        for (int i2 = 0; i2 < iNumRows2; i2++) {
            List<MTMathList> list = table.getCells().get(i2);
            List<MTMathList> list2 = list;
            int size = list2.size();
            MTDisplay[] mTDisplayArr2 = new MTDisplay[size];
            for (int i3 = 0; i3 < size; i3++) {
                mTDisplayArr2[i3] = new MTDisplay(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, false, 31, null);
            }
            mTDisplayArr[i2] = mTDisplayArr2;
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                MTMathListDisplay mTMathListDisplayCreateLineForMathList = INSTANCE.createLineForMathList(list.get(i4), this.font, this.style, false);
                mTMathListDisplayCreateLineForMathList.getClass();
                columnWidths[i4] = Float.valueOf(Math.max(mTMathListDisplayCreateLineForMathList.getWidth(), columnWidths[i4].floatValue()));
                mTDisplayArr2[i4] = mTMathListDisplayCreateLineForMathList;
            }
        }
        return mTDisplayArr;
    }

    public final float denominatorGapMin() {
        MTLineStyle mTLineStyle = this.style;
        MTLineStyle mTLineStyle2 = MTLineStyle.KMTLineStyleDisplay;
        MTFont mTFont = this.styleFont;
        return mTLineStyle == mTLineStyle2 ? mTFont.getMathTable().getFractionDenominatorDisplayStyleGapMin() : mTFont.getMathTable().getFractionDenominatorGapMin();
    }

    public final float denominatorShiftDown(boolean hasRule) {
        MTLineStyle mTLineStyle = this.style;
        if (hasRule) {
            MTLineStyle mTLineStyle2 = MTLineStyle.KMTLineStyleDisplay;
            MTFont mTFont = this.styleFont;
            return mTLineStyle == mTLineStyle2 ? mTFont.getMathTable().getFractionDenominatorDisplayStyleShiftDown() : mTFont.getMathTable().getFractionDenominatorShiftDown();
        }
        MTLineStyle mTLineStyle3 = MTLineStyle.KMTLineStyleDisplay;
        MTFont mTFont2 = this.styleFont;
        return mTLineStyle == mTLineStyle3 ? mTFont2.getMathTable().getStackBottomDisplayStyleShiftDown() : mTFont2.getMathTable().getStackBottomShiftDown();
    }

    public final float fractionDelimiterHeight() {
        MTLineStyle mTLineStyle = this.style;
        MTLineStyle mTLineStyle2 = MTLineStyle.KMTLineStyleDisplay;
        MTFont mTFont = this.styleFont;
        return mTLineStyle == mTLineStyle2 ? mTFont.getMathTable().getFractionDelimiterDisplayStyleSize() : mTFont.getMathTable().getFractionDelimiterSize();
    }

    public final boolean getCramped() {
        return this.cramped;
    }

    public final List<MTMathAtom> getCurrentAtoms() {
        return this.currentAtoms;
    }

    public final String getCurrentLine() {
        return this.currentLine;
    }

    public final NSRange getCurrentLineIndexRange() {
        return this.currentLineIndexRange;
    }

    public final CGPoint getCurrentPosition() {
        return this.currentPosition;
    }

    public final List<MTDisplay> getDisplayAtoms() {
        return this.displayAtoms;
    }

    public final MTFont getFont() {
        return this.font;
    }

    public final boolean getSpaced() {
        return this.spaced;
    }

    public final MTLineStyle getStyle() {
        return this.style;
    }

    public final MTFont getStyleFont() {
        return this.styleFont;
    }

    public final float numeratorGapMin() {
        MTLineStyle mTLineStyle = this.style;
        MTLineStyle mTLineStyle2 = MTLineStyle.KMTLineStyleDisplay;
        MTFont mTFont = this.styleFont;
        return mTLineStyle == mTLineStyle2 ? mTFont.getMathTable().getFractionNumeratorDisplayStyleGapMin() : mTFont.getMathTable().getFractionNumeratorGapMin();
    }

    public final float numeratorShiftUp(boolean hasRule) {
        MTLineStyle mTLineStyle = this.style;
        if (hasRule) {
            MTLineStyle mTLineStyle2 = MTLineStyle.KMTLineStyleDisplay;
            MTFont mTFont = this.styleFont;
            return mTLineStyle == mTLineStyle2 ? mTFont.getMathTable().getFractionNumeratorDisplayStyleShiftUp() : mTFont.getMathTable().getFractionNumeratorShiftUp();
        }
        MTLineStyle mTLineStyle3 = MTLineStyle.KMTLineStyleDisplay;
        MTFont mTFont2 = this.styleFont;
        return mTLineStyle == mTLineStyle3 ? mTFont2.getMathTable().getStackTopDisplayStyleShiftUp() : mTFont2.getMathTable().getStackTopShiftUp();
    }

    public final void setCramped(boolean z) {
        this.cramped = z;
    }

    public final void setCurrentAtoms(List<MTMathAtom> list) {
        list.getClass();
        this.currentAtoms = list;
    }

    public final void setCurrentLine(String str) {
        str.getClass();
        this.currentLine = str;
    }

    public final void setCurrentLineIndexRange(NSRange nSRange) {
        nSRange.getClass();
        this.currentLineIndexRange = nSRange;
    }

    public final void setDisplayAtoms(List<MTDisplay> list) {
        list.getClass();
        this.displayAtoms = list;
    }

    public final void setSpaced(boolean z) {
        this.spaced = z;
    }

    public final void setStyle(MTLineStyle mTLineStyle) {
        mTLineStyle.getClass();
        this.style = mTLineStyle;
        MTFont mTFont = this.font;
        this.styleFont = mTFont.copyFontWithSize(getStyleSize(mTLineStyle, mTFont));
    }

    public final void setStyleFont(MTFont mTFont) {
        mTFont.getClass();
        this.styleFont = mTFont;
    }

    public final float stackGapMin() {
        MTLineStyle mTLineStyle = this.style;
        MTLineStyle mTLineStyle2 = MTLineStyle.KMTLineStyleDisplay;
        MTFont mTFont = this.styleFont;
        return mTLineStyle == mTLineStyle2 ? mTFont.getMathTable().getStackDisplayStyleGapMin() : mTFont.getMathTable().getStackGapMin();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0007¨\u0006\u0013"}, d2 = {"Lcom/agog/mathdisplay/render/MTTypesetter$Companion;", "", "<init>", "()V", "createLineForMathList", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "mathList", "Lcom/agog/mathdisplay/parse/MTMathList;", "font", "Lcom/agog/mathdisplay/render/MTFont;", "style", "Lcom/agog/mathdisplay/parse/MTLineStyle;", "cramped", "", "spaced", "preprocessMathList", "", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "ml", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final MTMathListDisplay createLineForMathList(MTMathList mathList, MTFont font, MTLineStyle style, boolean cramped, boolean spaced) throws MathDisplayException {
            NSRange indexRange;
            List<MTMathAtom> listPreprocessMathList = preprocessMathList(mathList);
            MTTypesetter mTTypesetter = new MTTypesetter(font, style, cramped, spaced);
            mTTypesetter.createDisplayAtoms(listPreprocessMathList);
            MTMathAtom mTMathAtom = (MTMathAtom) w44.V0(mathList.getAtoms());
            return new MTMathListDisplay(mTTypesetter.getDisplayAtoms(), new NSRange(0, (mTMathAtom == null || (indexRange = mTMathAtom.getIndexRange()) == null) ? 0 : indexRange.getMaxrange()));
        }

        public final List<MTMathAtom> preprocessMathList(MTMathList ml) throws MathDisplayException {
            ml.getClass();
            ArrayList arrayList = new ArrayList();
            MTMathAtom mTMathAtom = null;
            for (MTMathAtom mTMathAtom2 : ml.getAtoms()) {
                if (mTMathAtom2.getType() == MTMathAtomType.KMTMathAtomVariable || mTMathAtom2.getType() == MTMathAtomType.KMTMathAtomNumber) {
                    String strChangeFont = MTCharsetKt.changeFont(mTMathAtom2.getNucleus(), mTMathAtom2.getFontStyle());
                    mTMathAtom2.setType(MTMathAtomType.KMTMathAtomOrdinary);
                    mTMathAtom2.setNucleus(strChangeFont);
                } else if (mTMathAtom2.getType() == MTMathAtomType.KMTMathAtomUnaryOperator) {
                    mTMathAtom2.setType(MTMathAtomType.KMTMathAtomOrdinary);
                }
                MTMathAtomType type = mTMathAtom2.getType();
                MTMathAtomType mTMathAtomType = MTMathAtomType.KMTMathAtomOrdinary;
                if (type == mTMathAtomType && mTMathAtom != null && mTMathAtom.getType() == mTMathAtomType && mTMathAtom.getSubScript() == null && mTMathAtom.getSuperScript() == null) {
                    mTMathAtom.fuse(mTMathAtom2);
                } else {
                    arrayList.add(mTMathAtom2);
                    mTMathAtom = mTMathAtom2;
                }
            }
            return arrayList;
        }

        private Companion() {
        }

        public final MTMathListDisplay createLineForMathList(MTMathList mathList, MTFont font, MTLineStyle style, boolean cramped) {
            mathList.getClass();
            font.getClass();
            style.getClass();
            return createLineForMathList(mathList, font, style, cramped, false);
        }

        public final MTMathListDisplay createLineForMathList(MTMathList mathList, MTFont font, MTLineStyle style) {
            mathList.getClass();
            font.getClass();
            style.getClass();
            return createLineForMathList(mathList.finalized(), font, style, false);
        }
    }

    public /* synthetic */ MTTypesetter(MTFont mTFont, MTLineStyle mTLineStyle, boolean z, boolean z2, int i, mq5 mq5Var) {
        this(mTFont, mTLineStyle, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
