package com.agog.mathdisplay.parse;

import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.cpc;
import defpackage.mdj;
import defpackage.sta;
import defpackage.w44;
import defpackage.wg6;
import defpackage.x44;
import defpackage.y6a;
import defpackage.zh4;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0006J\u001f\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u0004\u0018\u00010\u00172\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170(¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010+\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J\u0017\u0010+\u001a\u0004\u0018\u00010\u00172\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b+\u00100J\u0017\u00102\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u00020\u0017¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0004\u0018\u00010\u00172\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\b5\u0010$J\u0015\u00108\u001a\u00020\u00172\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u001d\u0010\u0014\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u0017¢\u0006\u0004\b\u0014\u0010<J5\u0010B\u001a\u0004\u0018\u00010\u00042\b\u0010=\u001a\u0004\u0018\u00010\u00172\u0012\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0>0>2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u0004\u0018\u00010\u00042\u0006\u0010D\u001a\u00020\u0017¢\u0006\u0004\bE\u00103R3\u0010H\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002060Fj\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000206`G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR0\u0010L\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040Fj\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0004`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010IR3\u0010M\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170Fj\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`G8\u0006¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u0010KR0\u0010O\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170Fj\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010IR0\u0010P\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170Fj\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010IR0\u0010Q\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170Fj\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010IR0\u0010R\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170Fj\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010IR0\u0010S\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170Fj\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010I¨\u0006T"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathAtomFactory;", "", "<init>", "()V", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "divide", "()Lcom/agog/mathdisplay/parse/MTMathAtom;", "placeholder", "Lcom/agog/mathdisplay/parse/MTMathList;", "placeholderList", "()Lcom/agog/mathdisplay/parse/MTMathList;", "Lcom/agog/mathdisplay/parse/MTFraction;", "placeholderFraction", "()Lcom/agog/mathdisplay/parse/MTFraction;", "Lcom/agog/mathdisplay/parse/MTRadical;", "placeholderRadical", "()Lcom/agog/mathdisplay/parse/MTRadical;", "placeholderSquareRoot", "num", "denom", "fractionWithNumerator", "(Lcom/agog/mathdisplay/parse/MTMathList;Lcom/agog/mathdisplay/parse/MTMathList;)Lcom/agog/mathdisplay/parse/MTFraction;", "times", "", "name", "", "limits", "Lcom/agog/mathdisplay/parse/MTLargeOperator;", "operatorWithName$mathdisplaylib", "(Ljava/lang/String;Z)Lcom/agog/mathdisplay/parse/MTLargeOperator;", "operatorWithName", "chars", "mathListForCharacters", "(Ljava/lang/String;)Lcom/agog/mathdisplay/parse/MTMathList;", "atom", "latexSymbolNameForAtom", "(Lcom/agog/mathdisplay/parse/MTMathAtom;)Ljava/lang/String;", "Liei;", "addLatexSymbol", "(Ljava/lang/String;Lcom/agog/mathdisplay/parse/MTMathAtom;)V", "", "supportedLatexSymbolNames", "()Ljava/util/List;", "accentName", "Lcom/agog/mathdisplay/parse/MTAccent;", "accentWithName", "(Ljava/lang/String;)Lcom/agog/mathdisplay/parse/MTAccent;", "accent", "(Lcom/agog/mathdisplay/parse/MTAccent;)Ljava/lang/String;", "delimName", "boundaryAtomForDelimiterName", "(Ljava/lang/String;)Lcom/agog/mathdisplay/parse/MTMathAtom;", "boundary", "delimiterNameForBoundaryAtom", "Lcom/agog/mathdisplay/parse/MTFontStyle;", "fontStyle", "fontNameForStyle", "(Lcom/agog/mathdisplay/parse/MTFontStyle;)Ljava/lang/String;", "numStr", "denominatorStr", "(Ljava/lang/String;Ljava/lang/String;)Lcom/agog/mathdisplay/parse/MTFraction;", "env", "", "cells", "Lcom/agog/mathdisplay/parse/MTParseError;", "error", "tableWithEnvironment", "(Ljava/lang/String;Ljava/util/List;Lcom/agog/mathdisplay/parse/MTParseError;)Lcom/agog/mathdisplay/parse/MTMathAtom;", "symbolName", "atomForLatexSymbolName", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "fontStyleWithName", "Ljava/util/HashMap;", "getFontStyleWithName", "()Ljava/util/HashMap;", "supportedLatexSymbols", "aliases", "getAliases", "textToLatexSymbolNames", "accents", "accentToCommands", "delimiters", "delimValueToName", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public class MTMathAtomFactory {
    private final HashMap<String, String> accentToCommands;
    private final HashMap<String, String> accents;
    private final HashMap<String, String> aliases;
    private final HashMap<String, String> delimValueToName;
    private final HashMap<String, String> delimiters;
    private final HashMap<String, MTFontStyle> fontStyleWithName;
    private final HashMap<String, MTMathAtom> supportedLatexSymbols;
    private final HashMap<String, String> textToLatexSymbolNames;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = mdj.f)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MTFontStyle.values().length];
            try {
                iArr[MTFontStyle.KMTFontStyleDefault.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleRoman.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleBold.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleFraktur.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleCaligraphic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleItalic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleSansSerif.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleBlackboard.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleTypewriter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleBoldItalic.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MTMathAtomFactory() {
        String str;
        cpc cpcVarX = zh4.x("mathnormal", MTFontStyle.KMTFontStyleDefault);
        MTFontStyle mTFontStyle = MTFontStyle.KMTFontStyleRoman;
        cpc cpcVarX2 = zh4.x("mathrm", mTFontStyle);
        cpc cpcVarX3 = zh4.x("textrm", mTFontStyle);
        cpc cpcVarX4 = zh4.x("rm", mTFontStyle);
        MTFontStyle mTFontStyle2 = MTFontStyle.KMTFontStyleBold;
        cpc cpcVarX5 = zh4.x("mathbf", mTFontStyle2);
        cpc cpcVarX6 = zh4.x("bf", mTFontStyle2);
        cpc cpcVarX7 = zh4.x("textbf", mTFontStyle2);
        MTFontStyle mTFontStyle3 = MTFontStyle.KMTFontStyleCaligraphic;
        cpc cpcVarX8 = zh4.x("mathcal", mTFontStyle3);
        cpc cpcVarX9 = zh4.x("cal", mTFontStyle3);
        cpc cpcVarX10 = zh4.x("mathscr", mTFontStyle3);
        MTFontStyle mTFontStyle4 = MTFontStyle.KMTFontStyleTypewriter;
        cpc cpcVarX11 = zh4.x("mathtt", mTFontStyle4);
        cpc cpcVarX12 = zh4.x("texttt", mTFontStyle4);
        MTFontStyle mTFontStyle5 = MTFontStyle.KMTFontStyleItalic;
        cpc cpcVarX13 = zh4.x("mathit", mTFontStyle5);
        cpc cpcVarX14 = zh4.x("textit", mTFontStyle5);
        cpc cpcVarX15 = zh4.x("mit", mTFontStyle5);
        MTFontStyle mTFontStyle6 = MTFontStyle.KMTFontStyleSansSerif;
        cpc cpcVarX16 = zh4.x("mathsf", mTFontStyle6);
        cpc cpcVarX17 = zh4.x("textsf", mTFontStyle6);
        MTFontStyle mTFontStyle7 = MTFontStyle.KMTFontStyleFraktur;
        cpc cpcVarX18 = zh4.x("mathfrak", mTFontStyle7);
        cpc cpcVarX19 = zh4.x("frak", mTFontStyle7);
        cpc cpcVarX20 = zh4.x("mathbb", MTFontStyle.KMTFontStyleBlackboard);
        MTFontStyle mTFontStyle8 = MTFontStyle.KMTFontStyleBoldItalic;
        this.fontStyleWithName = sta.g0(cpcVarX, cpcVarX2, cpcVarX3, cpcVarX4, cpcVarX5, cpcVarX6, cpcVarX7, cpcVarX8, cpcVarX9, cpcVarX10, cpcVarX11, cpcVarX12, cpcVarX13, cpcVarX14, cpcVarX15, cpcVarX16, cpcVarX17, cpcVarX18, cpcVarX19, cpcVarX20, zh4.x("mathbfit", mTFontStyle8), zh4.x("bm", mTFontStyle8), zh4.x("boldsymbol", mTFontStyle8), zh4.x("text", mTFontStyle), zh4.x("textnormal", mTFontStyle), zh4.x("textup", mTFontStyle));
        cpc cpcVarX21 = zh4.x("square", placeholder());
        MTMathAtomType mTMathAtomType = MTMathAtomType.KMTMathAtomVariable;
        cpc cpcVarX22 = zh4.x("alpha", new MTMathAtom(mTMathAtomType, "α"));
        cpc cpcVarN = y6a.n(mTMathAtomType, "β", "beta");
        cpc cpcVarN2 = y6a.n(mTMathAtomType, "γ", "gamma");
        cpc cpcVarN3 = y6a.n(mTMathAtomType, "δ", "delta");
        cpc cpcVarN4 = y6a.n(mTMathAtomType, "ε", "varepsilon");
        cpc cpcVarN5 = y6a.n(mTMathAtomType, "ζ", "zeta");
        cpc cpcVarN6 = y6a.n(mTMathAtomType, "η", "eta");
        cpc cpcVarN7 = y6a.n(mTMathAtomType, "θ", "theta");
        cpc cpcVarN8 = y6a.n(mTMathAtomType, "ι", "iota");
        cpc cpcVarN9 = y6a.n(mTMathAtomType, "κ", "kappa");
        cpc cpcVarN10 = y6a.n(mTMathAtomType, "λ", "lambda");
        cpc cpcVarN11 = y6a.n(mTMathAtomType, "μ", "mu");
        cpc cpcVarN12 = y6a.n(mTMathAtomType, "ν", "nu");
        cpc cpcVarN13 = y6a.n(mTMathAtomType, "ξ", "xi");
        cpc cpcVarN14 = y6a.n(mTMathAtomType, "ο", "omicron");
        cpc cpcVarN15 = y6a.n(mTMathAtomType, "π", "pi");
        cpc cpcVarN16 = y6a.n(mTMathAtomType, "ρ", "rho");
        cpc cpcVarN17 = y6a.n(mTMathAtomType, "ς", "varsigma");
        cpc cpcVarN18 = y6a.n(mTMathAtomType, "σ", "sigma");
        cpc cpcVarN19 = y6a.n(mTMathAtomType, "τ", "tau");
        cpc cpcVarN20 = y6a.n(mTMathAtomType, "υ", "upsilon");
        cpc cpcVarN21 = y6a.n(mTMathAtomType, "φ", "varphi");
        cpc cpcVarN22 = y6a.n(mTMathAtomType, "χ", "chi");
        cpc cpcVarN23 = y6a.n(mTMathAtomType, "ψ", "psi");
        cpc cpcVarN24 = y6a.n(mTMathAtomType, "ω", "omega");
        cpc cpcVarN25 = y6a.n(mTMathAtomType, "ϑ", "vartheta");
        cpc cpcVarN26 = y6a.n(mTMathAtomType, "ϕ", "phi");
        cpc cpcVarN27 = y6a.n(mTMathAtomType, "ϖ", "varpi");
        cpc cpcVarN28 = y6a.n(mTMathAtomType, "ϰ", "varkappa");
        cpc cpcVarN29 = y6a.n(mTMathAtomType, "ϱ", "varrho");
        cpc cpcVarN30 = y6a.n(mTMathAtomType, "ϵ", "epsilon");
        cpc cpcVarN31 = y6a.n(mTMathAtomType, "Γ", "Gamma");
        cpc cpcVarN32 = y6a.n(mTMathAtomType, "Δ", "Delta");
        cpc cpcVarN33 = y6a.n(mTMathAtomType, "Θ", "Theta");
        cpc cpcVarN34 = y6a.n(mTMathAtomType, "Λ", "Lambda");
        cpc cpcVarN35 = y6a.n(mTMathAtomType, "Ξ", "Xi");
        cpc cpcVarN36 = y6a.n(mTMathAtomType, "Π", "Pi");
        cpc cpcVarN37 = y6a.n(mTMathAtomType, "Σ", "Sigma");
        cpc cpcVarN38 = y6a.n(mTMathAtomType, "Υ", "Upsilon");
        cpc cpcVarN39 = y6a.n(mTMathAtomType, "Φ", "Phi");
        cpc cpcVarN40 = y6a.n(mTMathAtomType, "Ψ", "Psi");
        cpc cpcVarN41 = y6a.n(mTMathAtomType, "Ω", "Omega");
        MTMathAtomType mTMathAtomType2 = MTMathAtomType.KMTMathAtomOpen;
        cpc cpcVarX23 = zh4.x("lceil", new MTMathAtom(mTMathAtomType2, "⌈"));
        cpc cpcVarN42 = y6a.n(mTMathAtomType2, "⌊", "lfloor");
        cpc cpcVarN43 = y6a.n(mTMathAtomType2, "⟨", "langle");
        cpc cpcVarN44 = y6a.n(mTMathAtomType2, "⟮", "lgroup");
        cpc cpcVarN45 = y6a.n(mTMathAtomType2, "⟦", "llbracket");
        cpc cpcVarN46 = y6a.n(mTMathAtomType2, "⌜", "ulcorner");
        cpc cpcVarN47 = y6a.n(mTMathAtomType2, "⌞", "llcorner");
        MTMathAtomType mTMathAtomType3 = MTMathAtomType.KMTMathAtomClose;
        cpc cpcVarX24 = zh4.x("rceil", new MTMathAtom(mTMathAtomType3, "⌉"));
        cpc cpcVarN48 = y6a.n(mTMathAtomType3, "⌋", "rfloor");
        cpc cpcVarN49 = y6a.n(mTMathAtomType3, "⟩", "rangle");
        cpc cpcVarN50 = y6a.n(mTMathAtomType3, "⟯", "rgroup");
        cpc cpcVarN51 = y6a.n(mTMathAtomType3, "⟧", "rrbracket");
        cpc cpcVarN52 = y6a.n(mTMathAtomType3, "⌝", "urcorner");
        cpc cpcVarN53 = y6a.n(mTMathAtomType3, "⌟", "lrcorner");
        MTMathAtomType mTMathAtomType4 = MTMathAtomType.KMTMathAtomRelation;
        cpc cpcVarX25 = zh4.x("leftarrow", new MTMathAtom(mTMathAtomType4, "←"));
        cpc cpcVarN54 = y6a.n(mTMathAtomType4, "↑", "uparrow");
        cpc cpcVarN55 = y6a.n(mTMathAtomType4, "→", "rightarrow");
        cpc cpcVarN56 = y6a.n(mTMathAtomType4, "↓", "downarrow");
        cpc cpcVarN57 = y6a.n(mTMathAtomType4, "↔", "leftrightarrow");
        cpc cpcVarN58 = y6a.n(mTMathAtomType4, "↕", "updownarrow");
        cpc cpcVarN59 = y6a.n(mTMathAtomType4, "↖", "nwarrow");
        cpc cpcVarN60 = y6a.n(mTMathAtomType4, "↗", "nearrow");
        cpc cpcVarN61 = y6a.n(mTMathAtomType4, "↘", "searrow");
        cpc cpcVarN62 = y6a.n(mTMathAtomType4, "↙", "swarrow");
        cpc cpcVarN63 = y6a.n(mTMathAtomType4, "↦", "mapsto");
        cpc cpcVarN64 = y6a.n(mTMathAtomType4, "⇐", "Leftarrow");
        cpc cpcVarN65 = y6a.n(mTMathAtomType4, "⇑", "Uparrow");
        cpc cpcVarN66 = y6a.n(mTMathAtomType4, "⇒", "Rightarrow");
        cpc cpcVarN67 = y6a.n(mTMathAtomType4, "⇓", "Downarrow");
        cpc cpcVarN68 = y6a.n(mTMathAtomType4, "⇔", "Leftrightarrow");
        cpc cpcVarN69 = y6a.n(mTMathAtomType4, "⇕", "Updownarrow");
        cpc cpcVarN70 = y6a.n(mTMathAtomType4, "⟵", "longleftarrow");
        cpc cpcVarN71 = y6a.n(mTMathAtomType4, "⟶", "longrightarrow");
        cpc cpcVarN72 = y6a.n(mTMathAtomType4, "⟷", "longleftrightarrow");
        cpc cpcVarN73 = y6a.n(mTMathAtomType4, "⟸", "Longleftarrow");
        cpc cpcVarN74 = y6a.n(mTMathAtomType4, "⟹", "Longrightarrow");
        cpc cpcVarN75 = y6a.n(mTMathAtomType4, "⟺", "Longleftrightarrow");
        cpc cpcVarN76 = y6a.n(mTMathAtomType4, "⟼", "longmapsto");
        cpc cpcVarN77 = y6a.n(mTMathAtomType4, "↪", "hookrightarrow");
        cpc cpcVarN78 = y6a.n(mTMathAtomType4, "↩", "hookleftarrow");
        cpc cpcVarN79 = y6a.n(mTMathAtomType4, "≤", "leq");
        cpc cpcVarN80 = y6a.n(mTMathAtomType4, "≥", "geq");
        cpc cpcVarN81 = y6a.n(mTMathAtomType4, "≠", "neq");
        cpc cpcVarN82 = y6a.n(mTMathAtomType4, "∈", "in");
        cpc cpcVarN83 = y6a.n(mTMathAtomType4, "∉", "notin");
        cpc cpcVarN84 = y6a.n(mTMathAtomType4, "∋", "ni");
        cpc cpcVarN85 = y6a.n(mTMathAtomType4, "∝", "propto");
        cpc cpcVarN86 = y6a.n(mTMathAtomType4, "∣", "mid");
        cpc cpcVarN87 = y6a.n(mTMathAtomType4, "∥", "parallel");
        cpc cpcVarN88 = y6a.n(mTMathAtomType4, "∼", "sim");
        cpc cpcVarN89 = y6a.n(mTMathAtomType4, "≃", "simeq");
        cpc cpcVarN90 = y6a.n(mTMathAtomType4, "≅", "cong");
        cpc cpcVarN91 = y6a.n(mTMathAtomType4, "≈", "approx");
        cpc cpcVarN92 = y6a.n(mTMathAtomType4, "≍", "asymp");
        cpc cpcVarN93 = y6a.n(mTMathAtomType4, "≐", "doteq");
        cpc cpcVarN94 = y6a.n(mTMathAtomType4, "≡", "equiv");
        cpc cpcVarN95 = y6a.n(mTMathAtomType4, "≫", "gg");
        cpc cpcVarN96 = y6a.n(mTMathAtomType4, "≪", "ll");
        cpc cpcVarN97 = y6a.n(mTMathAtomType4, "≺", "prec");
        cpc cpcVarN98 = y6a.n(mTMathAtomType4, "≻", "succ");
        cpc cpcVarN99 = y6a.n(mTMathAtomType4, "⊂", "subset");
        cpc cpcVarN100 = y6a.n(mTMathAtomType4, "⊃", "supset");
        cpc cpcVarN101 = y6a.n(mTMathAtomType4, "⊆", "subseteq");
        cpc cpcVarN102 = y6a.n(mTMathAtomType4, "⊇", "supseteq");
        cpc cpcVarN103 = y6a.n(mTMathAtomType4, "⊏", "sqsubset");
        cpc cpcVarN104 = y6a.n(mTMathAtomType4, "⊐", "sqsupset");
        cpc cpcVarN105 = y6a.n(mTMathAtomType4, "⊑", "sqsubseteq");
        cpc cpcVarN106 = y6a.n(mTMathAtomType4, "⊒", "sqsupseteq");
        cpc cpcVarN107 = y6a.n(mTMathAtomType4, "⊧", "models");
        cpc cpcVarN108 = y6a.n(mTMathAtomType4, "⟂", "perp");
        cpc cpcVarN109 = y6a.n(mTMathAtomType4, "⪯", "preceq");
        cpc cpcVarN110 = y6a.n(mTMathAtomType4, "⪰", "succeq");
        cpc cpcVarN111 = y6a.n(mTMathAtomType4, "⊢", "vdash");
        cpc cpcVarN112 = y6a.n(mTMathAtomType4, "⊣", "dashv");
        cpc cpcVarN113 = y6a.n(mTMathAtomType4, "⊨", "vDash");
        cpc cpcVarN114 = y6a.n(mTMathAtomType4, "∴", "therefore");
        cpc cpcVarN115 = y6a.n(mTMathAtomType4, "∵", "because");
        cpc cpcVarN116 = y6a.n(mTMathAtomType4, "≔", "coloneqq");
        cpc cpcVarN117 = y6a.n(mTMathAtomType4, "⩽", "leqslant");
        cpc cpcVarN118 = y6a.n(mTMathAtomType4, "⩾", "geqslant");
        cpc cpcVarN119 = y6a.n(mTMathAtomType4, "⋈", "bowtie");
        cpc cpcVarN120 = y6a.n(mTMathAtomType4, "⟹", "implies");
        cpc cpcVarN121 = y6a.n(mTMathAtomType4, "≮", "nless");
        cpc cpcVarN122 = y6a.n(mTMathAtomType4, "≯", "ngtr");
        cpc cpcVarN123 = y6a.n(mTMathAtomType4, "≰", "nleq");
        cpc cpcVarN124 = y6a.n(mTMathAtomType4, "≱", "ngeq");
        cpc cpcVarN125 = y6a.n(mTMathAtomType4, "⪇", "nleqslant");
        cpc cpcVarN126 = y6a.n(mTMathAtomType4, "⪈", "ngeqslant");
        cpc cpcVarN127 = y6a.n(mTMathAtomType4, "⪇", "lneq");
        cpc cpcVarN128 = y6a.n(mTMathAtomType4, "⪈", "gneq");
        cpc cpcVarN129 = y6a.n(mTMathAtomType4, "≨", "lneqq");
        cpc cpcVarN130 = y6a.n(mTMathAtomType4, "≩", "gneqq");
        cpc cpcVarN131 = y6a.n(mTMathAtomType4, "⋦", "lnsim");
        cpc cpcVarN132 = y6a.n(mTMathAtomType4, "⋧", "gnsim");
        cpc cpcVarN133 = y6a.n(mTMathAtomType4, "⪉", "lnapprox");
        cpc cpcVarN134 = y6a.n(mTMathAtomType4, "⪊", "gnapprox");
        cpc cpcVarN135 = y6a.n(mTMathAtomType4, "⊀", "nprec");
        cpc cpcVarN136 = y6a.n(mTMathAtomType4, "⊁", "nsucc");
        cpc cpcVarN137 = y6a.n(mTMathAtomType4, "⋠", "npreceq");
        cpc cpcVarN138 = y6a.n(mTMathAtomType4, "⋡", "nsucceq");
        cpc cpcVarN139 = y6a.n(mTMathAtomType4, "⪵", "precneqq");
        cpc cpcVarN140 = y6a.n(mTMathAtomType4, "⪶", "succneqq");
        cpc cpcVarN141 = y6a.n(mTMathAtomType4, "⋨", "precnsim");
        cpc cpcVarN142 = y6a.n(mTMathAtomType4, "⋩", "succnsim");
        cpc cpcVarN143 = y6a.n(mTMathAtomType4, "⪹", "precnapprox");
        cpc cpcVarN144 = y6a.n(mTMathAtomType4, "⪺", "succnapprox");
        cpc cpcVarN145 = y6a.n(mTMathAtomType4, "≁", "nsim");
        cpc cpcVarN146 = y6a.n(mTMathAtomType4, "≇", "ncong");
        cpc cpcVarN147 = y6a.n(mTMathAtomType4, "∤", "nmid");
        cpc cpcVarN148 = y6a.n(mTMathAtomType4, "∤", "nshortmid");
        cpc cpcVarN149 = y6a.n(mTMathAtomType4, "∦", "nparallel");
        cpc cpcVarN150 = y6a.n(mTMathAtomType4, "∦", "nshortparallel");
        cpc cpcVarN151 = y6a.n(mTMathAtomType4, "⊈", "nsubseteq");
        cpc cpcVarN152 = y6a.n(mTMathAtomType4, "⊉", "nsupseteq");
        cpc cpcVarN153 = y6a.n(mTMathAtomType4, "⊊", "subsetneq");
        cpc cpcVarN154 = y6a.n(mTMathAtomType4, "⊋", "supsetneq");
        cpc cpcVarN155 = y6a.n(mTMathAtomType4, "⫋", "subsetneqq");
        cpc cpcVarN156 = y6a.n(mTMathAtomType4, "⫌", "supsetneqq");
        cpc cpcVarN157 = y6a.n(mTMathAtomType4, "⊊", "varsubsetneq");
        cpc cpcVarN158 = y6a.n(mTMathAtomType4, "⊋", "varsupsetneq");
        cpc cpcVarN159 = y6a.n(mTMathAtomType4, "⫋", "varsubsetneqq");
        cpc cpcVarN160 = y6a.n(mTMathAtomType4, "⫌", "varsupsetneqq");
        cpc cpcVarN161 = y6a.n(mTMathAtomType4, "∌", "notni");
        cpc cpcVarN162 = y6a.n(mTMathAtomType4, "∌", "nni");
        cpc cpcVarN163 = y6a.n(mTMathAtomType4, "⋪", "ntriangleleft");
        cpc cpcVarN164 = y6a.n(mTMathAtomType4, "⋫", "ntriangleright");
        cpc cpcVarN165 = y6a.n(mTMathAtomType4, "⋬", "ntrianglelefteq");
        cpc cpcVarN166 = y6a.n(mTMathAtomType4, "⋭", "ntrianglerighteq");
        cpc cpcVarN167 = y6a.n(mTMathAtomType4, "⊬", "nvdash");
        cpc cpcVarN168 = y6a.n(mTMathAtomType4, "⊭", "nvDash");
        cpc cpcVarN169 = y6a.n(mTMathAtomType4, "⊮", "nVdash");
        cpc cpcVarN170 = y6a.n(mTMathAtomType4, "⊯", "nVDash");
        cpc cpcVarN171 = y6a.n(mTMathAtomType4, "⋢", "nsqsubseteq");
        cpc cpcVarN172 = y6a.n(mTMathAtomType4, "⋣", "nsqsupseteq");
        cpc cpcVarN173 = y6a.n(mTMathAtomType4, "⊩", "Vdash");
        cpc cpcVarN174 = y6a.n(mTMathAtomType4, "⊪", "Vvdash");
        cpc cpcVarN175 = y6a.n(mTMathAtomType4, "≊", "approxeq");
        cpc cpcVarN176 = y6a.n(mTMathAtomType4, "∽", "backsim");
        cpc cpcVarN177 = y6a.n(mTMathAtomType4, "⋍", "backsimeq");
        cpc cpcVarN178 = y6a.n(mTMathAtomType4, "≎", "Bumpeq");
        cpc cpcVarN179 = y6a.n(mTMathAtomType4, "≏", "bumpeq");
        cpc cpcVarN180 = y6a.n(mTMathAtomType4, "≗", "circeq");
        cpc cpcVarN181 = y6a.n(mTMathAtomType4, "≑", "Doteq");
        cpc cpcVarN182 = y6a.n(mTMathAtomType4, "≖", "eqcirc");
        cpc cpcVarN183 = y6a.n(mTMathAtomType4, "≂", "eqsim");
        cpc cpcVarN184 = y6a.n(mTMathAtomType4, "≒", "fallingdotseq");
        cpc cpcVarN185 = y6a.n(mTMathAtomType4, "≓", "risingdotseq");
        cpc cpcVarN186 = y6a.n(mTMathAtomType4, "≜", "triangleq");
        cpc cpcVarN187 = y6a.n(mTMathAtomType4, "≧", "geqq");
        cpc cpcVarN188 = y6a.n(mTMathAtomType4, "≦", "leqq");
        cpc cpcVarN189 = y6a.n(mTMathAtomType4, "⋙", "ggg");
        cpc cpcVarN190 = y6a.n(mTMathAtomType4, "⋘", "lll");
        cpc cpcVarN191 = y6a.n(mTMathAtomType4, "≷", "gtrless");
        cpc cpcVarN192 = y6a.n(mTMathAtomType4, "≶", "lessgtr");
        cpc cpcVarN193 = y6a.n(mTMathAtomType4, "⋛", "gtreqless");
        cpc cpcVarN194 = y6a.n(mTMathAtomType4, "⋚", "lesseqgtr");
        cpc cpcVarN195 = y6a.n(mTMathAtomType4, "⪌", "gtreqqless");
        cpc cpcVarN196 = y6a.n(mTMathAtomType4, "⪋", "lesseqqgtr");
        cpc cpcVarN197 = y6a.n(mTMathAtomType4, "⪆", "gtrapprox");
        cpc cpcVarN198 = y6a.n(mTMathAtomType4, "⪅", "lessapprox");
        cpc cpcVarN199 = y6a.n(mTMathAtomType4, "≳", "gtrsim");
        cpc cpcVarN200 = y6a.n(mTMathAtomType4, "≲", "lesssim");
        cpc cpcVarN201 = y6a.n(mTMathAtomType4, "⪖", "eqslantgtr");
        cpc cpcVarN202 = y6a.n(mTMathAtomType4, "⪕", "eqslantless");
        cpc cpcVarN203 = y6a.n(mTMathAtomType4, "≼", "preccurlyeq");
        cpc cpcVarN204 = y6a.n(mTMathAtomType4, "≽", "succcurlyeq");
        cpc cpcVarN205 = y6a.n(mTMathAtomType4, "≾", "precsim");
        cpc cpcVarN206 = y6a.n(mTMathAtomType4, "≿", "succsim");
        cpc cpcVarN207 = y6a.n(mTMathAtomType4, "⋞", "curlyeqprec");
        cpc cpcVarN208 = y6a.n(mTMathAtomType4, "⋟", "curlyeqsucc");
        cpc cpcVarN209 = y6a.n(mTMathAtomType4, "⋐", "Subset");
        cpc cpcVarN210 = y6a.n(mTMathAtomType4, "⋑", "Supset");
        cpc cpcVarN211 = y6a.n(mTMathAtomType4, "≬", "between");
        cpc cpcVarN212 = y6a.n(mTMathAtomType4, "∍", "backepsilon");
        cpc cpcVarN213 = y6a.n(mTMathAtomType4, "↞", "twoheadleftarrow");
        cpc cpcVarN214 = y6a.n(mTMathAtomType4, "↠", "twoheadrightarrow");
        cpc cpcVarN215 = y6a.n(mTMathAtomType4, "↢", "leftarrowtail");
        cpc cpcVarN216 = y6a.n(mTMathAtomType4, "↣", "rightarrowtail");
        cpc cpcVarN217 = y6a.n(mTMathAtomType4, "↚", "nleftarrow");
        cpc cpcVarN218 = y6a.n(mTMathAtomType4, "↛", "nrightarrow");
        cpc cpcVarN219 = y6a.n(mTMathAtomType4, "↮", "nleftrightarrow");
        cpc cpcVarN220 = y6a.n(mTMathAtomType4, "⇍", "nLeftarrow");
        cpc cpcVarN221 = y6a.n(mTMathAtomType4, "⇎", "nLeftrightarrow");
        cpc cpcVarN222 = y6a.n(mTMathAtomType4, "⇏", "nRightarrow");
        cpc cpcVarN223 = y6a.n(mTMathAtomType4, "⇚", "Lleftarrow");
        cpc cpcVarN224 = y6a.n(mTMathAtomType4, "⇛", "Rrightarrow");
        cpc cpcVarN225 = y6a.n(mTMathAtomType4, "↰", "Lsh");
        cpc cpcVarN226 = y6a.n(mTMathAtomType4, "↱", "Rsh");
        cpc cpcVarN227 = y6a.n(mTMathAtomType4, "⇇", "leftleftarrows");
        cpc cpcVarN228 = y6a.n(mTMathAtomType4, "⇉", "rightrightarrows");
        cpc cpcVarN229 = y6a.n(mTMathAtomType4, "⇈", "upuparrows");
        cpc cpcVarN230 = y6a.n(mTMathAtomType4, "⇊", "downdownarrows");
        cpc cpcVarN231 = y6a.n(mTMathAtomType4, "⇆", "leftrightarrows");
        cpc cpcVarN232 = y6a.n(mTMathAtomType4, "⇄", "rightleftarrows");
        cpc cpcVarN233 = y6a.n(mTMathAtomType4, "↫", "looparrowleft");
        cpc cpcVarN234 = y6a.n(mTMathAtomType4, "↬", "looparrowright");
        cpc cpcVarN235 = y6a.n(mTMathAtomType4, "↭", "leftrightsquigarrow");
        cpc cpcVarN236 = y6a.n(mTMathAtomType4, "⇝", "rightsquigarrow");
        cpc cpcVarN237 = y6a.n(mTMathAtomType4, "↺", "circlearrowleft");
        cpc cpcVarN238 = y6a.n(mTMathAtomType4, "↻", "circlearrowright");
        cpc cpcVarN239 = y6a.n(mTMathAtomType4, "↶", "curvearrowleft");
        cpc cpcVarN240 = y6a.n(mTMathAtomType4, "↷", "curvearrowright");
        cpc cpcVarN241 = y6a.n(mTMathAtomType4, "⊸", "multimap");
        cpc cpcVarN242 = y6a.n(mTMathAtomType4, "↼", "leftharpoonup");
        cpc cpcVarN243 = y6a.n(mTMathAtomType4, "↽", "leftharpoondown");
        cpc cpcVarN244 = y6a.n(mTMathAtomType4, "⇀", "rightharpoonup");
        cpc cpcVarN245 = y6a.n(mTMathAtomType4, "⇁", "rightharpoondown");
        cpc cpcVarN246 = y6a.n(mTMathAtomType4, "↿", "upharpoonleft");
        cpc cpcVarN247 = y6a.n(mTMathAtomType4, "↾", "upharpoonright");
        cpc cpcVarN248 = y6a.n(mTMathAtomType4, "⇃", "downharpoonleft");
        cpc cpcVarN249 = y6a.n(mTMathAtomType4, "⇂", "downharpoonright");
        cpc cpcVarN250 = y6a.n(mTMathAtomType4, "⇋", "leftrightharpoons");
        cpc cpcVarN251 = y6a.n(mTMathAtomType4, "⇌", "rightleftharpoons");
        cpc cpcVarN252 = y6a.n(mTMathAtomType4, "◀", "blacktriangleleft");
        cpc cpcVarN253 = y6a.n(mTMathAtomType4, "▶", "blacktriangleright");
        cpc cpcVarN254 = y6a.n(mTMathAtomType4, "⌢", "frown");
        cpc cpcVarN255 = y6a.n(mTMathAtomType4, "⌣", "smile");
        cpc cpcVarN256 = y6a.n(mTMathAtomType4, "⊲", "vartriangleleft");
        cpc cpcVarN257 = y6a.n(mTMathAtomType4, "⊳", "vartriangleright");
        cpc cpcVarN258 = y6a.n(mTMathAtomType4, "⊴", "trianglelefteq");
        cpc cpcVarN259 = y6a.n(mTMathAtomType4, "⊵", "trianglerighteq");
        cpc cpcVarX26 = zh4.x("times", times());
        cpc cpcVarX27 = zh4.x("div", divide());
        MTMathAtomType mTMathAtomType5 = MTMathAtomType.KMTMathAtomBinaryOperator;
        cpc cpcVarX28 = zh4.x("pm", new MTMathAtom(mTMathAtomType5, "±"));
        cpc cpcVarN260 = y6a.n(mTMathAtomType5, "†", "dagger");
        cpc cpcVarN261 = y6a.n(mTMathAtomType5, "‡", "ddagger");
        cpc cpcVarN262 = y6a.n(mTMathAtomType5, "∓", "mp");
        cpc cpcVarN263 = y6a.n(mTMathAtomType5, "∖", "setminus");
        cpc cpcVarN264 = y6a.n(mTMathAtomType5, "∗", "ast");
        cpc cpcVarN265 = y6a.n(mTMathAtomType5, "∘", "circ");
        cpc cpcVarN266 = y6a.n(mTMathAtomType5, "∙", "bullet");
        cpc cpcVarN267 = y6a.n(mTMathAtomType5, "∧", "wedge");
        cpc cpcVarN268 = y6a.n(mTMathAtomType5, "∨", "vee");
        cpc cpcVarN269 = y6a.n(mTMathAtomType5, "∩", "cap");
        cpc cpcVarN270 = y6a.n(mTMathAtomType5, "∪", "cup");
        cpc cpcVarN271 = y6a.n(mTMathAtomType5, "≀", "wr");
        cpc cpcVarN272 = y6a.n(mTMathAtomType5, "⊎", "uplus");
        cpc cpcVarN273 = y6a.n(mTMathAtomType5, "⊓", "sqcap");
        cpc cpcVarN274 = y6a.n(mTMathAtomType5, "⊔", "sqcup");
        cpc cpcVarN275 = y6a.n(mTMathAtomType5, "⊕", "oplus");
        cpc cpcVarN276 = y6a.n(mTMathAtomType5, "⊖", "ominus");
        cpc cpcVarN277 = y6a.n(mTMathAtomType5, "⊗", "otimes");
        cpc cpcVarN278 = y6a.n(mTMathAtomType5, "⊘", "oslash");
        cpc cpcVarN279 = y6a.n(mTMathAtomType5, "⊙", "odot");
        cpc cpcVarN280 = y6a.n(mTMathAtomType5, "⋆", "star");
        cpc cpcVarN281 = y6a.n(mTMathAtomType5, "⋅", "cdot");
        cpc cpcVarN282 = y6a.n(mTMathAtomType5, "⋄", "diamond");
        cpc cpcVarN283 = y6a.n(mTMathAtomType5, "⨿", "amalg");
        cpc cpcVarN284 = y6a.n(mTMathAtomType5, "⋉", "ltimes");
        cpc cpcVarN285 = y6a.n(mTMathAtomType5, "⋊", "rtimes");
        cpc cpcVarN286 = y6a.n(mTMathAtomType5, "⊛", "circledast");
        cpc cpcVarN287 = y6a.n(mTMathAtomType5, "⊚", "circledcirc");
        cpc cpcVarN288 = y6a.n(mTMathAtomType5, "⊝", "circleddash");
        cpc cpcVarN289 = y6a.n(mTMathAtomType5, "⊡", "boxdot");
        cpc cpcVarN290 = y6a.n(mTMathAtomType5, "⊟", "boxminus");
        cpc cpcVarN291 = y6a.n(mTMathAtomType5, "⊞", "boxplus");
        cpc cpcVarN292 = y6a.n(mTMathAtomType5, "⊠", "boxtimes");
        cpc cpcVarN293 = y6a.n(mTMathAtomType5, "⋇", "divideontimes");
        cpc cpcVarN294 = y6a.n(mTMathAtomType5, "∔", "dotplus");
        cpc cpcVarN295 = y6a.n(mTMathAtomType5, "⊺", "intercal");
        cpc cpcVarN296 = y6a.n(mTMathAtomType5, "⊼", "barwedge");
        cpc cpcVarN297 = y6a.n(mTMathAtomType5, "⊻", "veebar");
        cpc cpcVarN298 = y6a.n(mTMathAtomType5, "⋏", "curlywedge");
        cpc cpcVarN299 = y6a.n(mTMathAtomType5, "⋎", "curlyvee");
        cpc cpcVarN300 = y6a.n(mTMathAtomType5, "⩞", "doublebarwedge");
        cpc cpcVarN301 = y6a.n(mTMathAtomType5, "⋅", "centerdot");
        cpc cpcVarN302 = y6a.n(mTMathAtomType5, "⋒", "Cap");
        cpc cpcVarN303 = y6a.n(mTMathAtomType5, "⋓", "Cup");
        cpc cpcVarN304 = y6a.n(mTMathAtomType4, "⋗", "gtrdot");
        cpc cpcVarN305 = y6a.n(mTMathAtomType4, "⋖", "lessdot");
        cpc cpcVarN306 = y6a.n(mTMathAtomType5, "⋋", "leftthreetimes");
        cpc cpcVarN307 = y6a.n(mTMathAtomType5, "⋌", "rightthreetimes");
        cpc cpcVarN308 = y6a.n(mTMathAtomType5, "◯", "bigcirc");
        cpc cpcVarX29 = zh4.x("log", operatorWithName$mathdisplaylib("log", false));
        cpc cpcVarX30 = zh4.x("lg", operatorWithName$mathdisplaylib("lg", false));
        cpc cpcVarX31 = zh4.x("ln", operatorWithName$mathdisplaylib("ln", false));
        cpc cpcVarX32 = zh4.x("sin", operatorWithName$mathdisplaylib("sin", false));
        cpc cpcVarX33 = zh4.x("arcsin", operatorWithName$mathdisplaylib("arcsin", false));
        cpc cpcVarX34 = zh4.x("sinh", operatorWithName$mathdisplaylib("sinh", false));
        cpc cpcVarX35 = zh4.x("cos", operatorWithName$mathdisplaylib("cos", false));
        cpc cpcVarX36 = zh4.x("arccos", operatorWithName$mathdisplaylib("arccos", false));
        cpc cpcVarX37 = zh4.x("cosh", operatorWithName$mathdisplaylib("cosh", false));
        cpc cpcVarX38 = zh4.x("tan", operatorWithName$mathdisplaylib("tan", false));
        cpc cpcVarX39 = zh4.x("arctan", operatorWithName$mathdisplaylib("arctan", false));
        cpc cpcVarX40 = zh4.x("tanh", operatorWithName$mathdisplaylib("tanh", false));
        cpc cpcVarX41 = zh4.x("cot", operatorWithName$mathdisplaylib("cot", false));
        cpc cpcVarX42 = zh4.x("coth", operatorWithName$mathdisplaylib("coth", false));
        cpc cpcVarX43 = zh4.x("sec", operatorWithName$mathdisplaylib("sec", false));
        cpc cpcVarX44 = zh4.x("csc", operatorWithName$mathdisplaylib("csc", false));
        cpc cpcVarX45 = zh4.x("arccot", operatorWithName$mathdisplaylib("arccot", false));
        cpc cpcVarX46 = zh4.x("arcsec", operatorWithName$mathdisplaylib("arcsec", false));
        cpc cpcVarX47 = zh4.x("arccsc", operatorWithName$mathdisplaylib("arccsc", false));
        cpc cpcVarX48 = zh4.x("sech", operatorWithName$mathdisplaylib("sech", false));
        cpc cpcVarX49 = zh4.x("csch", operatorWithName$mathdisplaylib("csch", false));
        cpc cpcVarX50 = zh4.x("arcsinh", operatorWithName$mathdisplaylib("arcsinh", false));
        cpc cpcVarX51 = zh4.x("arccosh", operatorWithName$mathdisplaylib("arccosh", false));
        cpc cpcVarX52 = zh4.x("arctanh", operatorWithName$mathdisplaylib("arctanh", false));
        cpc cpcVarX53 = zh4.x("arccoth", operatorWithName$mathdisplaylib("arccoth", false));
        cpc cpcVarX54 = zh4.x("arcsech", operatorWithName$mathdisplaylib("arcsech", false));
        cpc cpcVarX55 = zh4.x("arccsch", operatorWithName$mathdisplaylib("arccsch", false));
        cpc cpcVarX56 = zh4.x("arg", operatorWithName$mathdisplaylib("arg", false));
        cpc cpcVarX57 = zh4.x("ker", operatorWithName$mathdisplaylib("ker", false));
        cpc cpcVarX58 = zh4.x("dim", operatorWithName$mathdisplaylib("dim", false));
        cpc cpcVarX59 = zh4.x("hom", operatorWithName$mathdisplaylib("hom", false));
        cpc cpcVarX60 = zh4.x("exp", operatorWithName$mathdisplaylib("exp", false));
        cpc cpcVarX61 = zh4.x("deg", operatorWithName$mathdisplaylib("deg", false));
        cpc cpcVarX62 = zh4.x("lim", operatorWithName$mathdisplaylib("lim", true));
        cpc cpcVarX63 = zh4.x("limsup", operatorWithName$mathdisplaylib("lim sup", true));
        cpc cpcVarX64 = zh4.x("liminf", operatorWithName$mathdisplaylib("lim inf", true));
        cpc cpcVarX65 = zh4.x("max", operatorWithName$mathdisplaylib("max", true));
        cpc cpcVarX66 = zh4.x("min", operatorWithName$mathdisplaylib("min", true));
        cpc cpcVarX67 = zh4.x("sup", operatorWithName$mathdisplaylib("sup", true));
        cpc cpcVarX68 = zh4.x("inf", operatorWithName$mathdisplaylib("inf", true));
        cpc cpcVarX69 = zh4.x("det", operatorWithName$mathdisplaylib("det", true));
        cpc cpcVarX70 = zh4.x("Pr", operatorWithName$mathdisplaylib("Pr", true));
        cpc cpcVarX71 = zh4.x("gcd", operatorWithName$mathdisplaylib("gcd", true));
        cpc cpcVarX72 = zh4.x("mod", operatorWithName$mathdisplaylib("mod", false));
        cpc cpcVarX73 = zh4.x("prod", operatorWithName$mathdisplaylib("∏", true));
        cpc cpcVarX74 = zh4.x("coprod", operatorWithName$mathdisplaylib("∐", true));
        cpc cpcVarX75 = zh4.x("sum", operatorWithName$mathdisplaylib("∑", true));
        cpc cpcVarX76 = zh4.x("int", operatorWithName$mathdisplaylib("∫", false));
        cpc cpcVarX77 = zh4.x("iint", operatorWithName$mathdisplaylib("∬", false));
        cpc cpcVarX78 = zh4.x("iiint", operatorWithName$mathdisplaylib("∭", false));
        cpc cpcVarX79 = zh4.x("iiiint", operatorWithName$mathdisplaylib("⨌", false));
        cpc cpcVarX80 = zh4.x("oint", operatorWithName$mathdisplaylib("∮", false));
        cpc cpcVarX81 = zh4.x("oiint", operatorWithName$mathdisplaylib("∯", false));
        cpc cpcVarX82 = zh4.x("oiiint", operatorWithName$mathdisplaylib("∰", false));
        cpc cpcVarX83 = zh4.x("intop", operatorWithName$mathdisplaylib("∫", true));
        cpc cpcVarX84 = zh4.x("smallint", operatorWithName$mathdisplaylib("∫", false));
        cpc cpcVarX85 = zh4.x("bigwedge", operatorWithName$mathdisplaylib("⋀", true));
        cpc cpcVarX86 = zh4.x("bigvee", operatorWithName$mathdisplaylib("⋁", true));
        cpc cpcVarX87 = zh4.x("bigcap", operatorWithName$mathdisplaylib("⋂", true));
        cpc cpcVarX88 = zh4.x("bigcup", operatorWithName$mathdisplaylib("⋃", true));
        cpc cpcVarX89 = zh4.x("bigodot", operatorWithName$mathdisplaylib("⨀", true));
        cpc cpcVarX90 = zh4.x("bigoplus", operatorWithName$mathdisplaylib("⨁", true));
        cpc cpcVarX91 = zh4.x("bigotimes", operatorWithName$mathdisplaylib("⨂", true));
        cpc cpcVarX92 = zh4.x("biguplus", operatorWithName$mathdisplaylib("⨄", true));
        cpc cpcVarX93 = zh4.x("bigsqcup", operatorWithName$mathdisplaylib("⨆", true));
        cpc cpcVarN309 = y6a.n(mTMathAtomType2, "{", "{");
        cpc cpcVarN310 = y6a.n(mTMathAtomType3, "}", "}");
        MTMathAtomType mTMathAtomType6 = MTMathAtomType.KMTMathAtomOrdinary;
        cpc cpcVarX94 = zh4.x("$", new MTMathAtom(mTMathAtomType6, "$"));
        cpc cpcVarN311 = y6a.n(mTMathAtomType6, "&", "&");
        cpc cpcVarN312 = y6a.n(mTMathAtomType6, "#", "#");
        cpc cpcVarN313 = y6a.n(mTMathAtomType6, "%", "%");
        cpc cpcVarN314 = y6a.n(mTMathAtomType6, "_", "_");
        cpc cpcVarN315 = y6a.n(mTMathAtomType6, " ", " ");
        cpc cpcVarN316 = y6a.n(mTMathAtomType6, "\\", "backslash");
        MTMathAtomType mTMathAtomType7 = MTMathAtomType.KMTMathAtomPunctuation;
        HashMap<String, MTMathAtom> mapG0 = sta.g0(cpcVarX21, cpcVarX22, cpcVarN, cpcVarN2, cpcVarN3, cpcVarN4, cpcVarN5, cpcVarN6, cpcVarN7, cpcVarN8, cpcVarN9, cpcVarN10, cpcVarN11, cpcVarN12, cpcVarN13, cpcVarN14, cpcVarN15, cpcVarN16, cpcVarN17, cpcVarN18, cpcVarN19, cpcVarN20, cpcVarN21, cpcVarN22, cpcVarN23, cpcVarN24, cpcVarN25, cpcVarN26, cpcVarN27, cpcVarN28, cpcVarN29, cpcVarN30, cpcVarN31, cpcVarN32, cpcVarN33, cpcVarN34, cpcVarN35, cpcVarN36, cpcVarN37, cpcVarN38, cpcVarN39, cpcVarN40, cpcVarN41, cpcVarX23, cpcVarN42, cpcVarN43, cpcVarN44, cpcVarN45, cpcVarN46, cpcVarN47, cpcVarX24, cpcVarN48, cpcVarN49, cpcVarN50, cpcVarN51, cpcVarN52, cpcVarN53, cpcVarX25, cpcVarN54, cpcVarN55, cpcVarN56, cpcVarN57, cpcVarN58, cpcVarN59, cpcVarN60, cpcVarN61, cpcVarN62, cpcVarN63, cpcVarN64, cpcVarN65, cpcVarN66, cpcVarN67, cpcVarN68, cpcVarN69, cpcVarN70, cpcVarN71, cpcVarN72, cpcVarN73, cpcVarN74, cpcVarN75, cpcVarN76, cpcVarN77, cpcVarN78, cpcVarN79, cpcVarN80, cpcVarN81, cpcVarN82, cpcVarN83, cpcVarN84, cpcVarN85, cpcVarN86, cpcVarN87, cpcVarN88, cpcVarN89, cpcVarN90, cpcVarN91, cpcVarN92, cpcVarN93, cpcVarN94, cpcVarN95, cpcVarN96, cpcVarN97, cpcVarN98, cpcVarN99, cpcVarN100, cpcVarN101, cpcVarN102, cpcVarN103, cpcVarN104, cpcVarN105, cpcVarN106, cpcVarN107, cpcVarN108, cpcVarN109, cpcVarN110, cpcVarN111, cpcVarN112, cpcVarN113, cpcVarN114, cpcVarN115, cpcVarN116, cpcVarN117, cpcVarN118, cpcVarN119, cpcVarN120, cpcVarN121, cpcVarN122, cpcVarN123, cpcVarN124, cpcVarN125, cpcVarN126, cpcVarN127, cpcVarN128, cpcVarN129, cpcVarN130, cpcVarN131, cpcVarN132, cpcVarN133, cpcVarN134, cpcVarN135, cpcVarN136, cpcVarN137, cpcVarN138, cpcVarN139, cpcVarN140, cpcVarN141, cpcVarN142, cpcVarN143, cpcVarN144, cpcVarN145, cpcVarN146, cpcVarN147, cpcVarN148, cpcVarN149, cpcVarN150, cpcVarN151, cpcVarN152, cpcVarN153, cpcVarN154, cpcVarN155, cpcVarN156, cpcVarN157, cpcVarN158, cpcVarN159, cpcVarN160, cpcVarN161, cpcVarN162, cpcVarN163, cpcVarN164, cpcVarN165, cpcVarN166, cpcVarN167, cpcVarN168, cpcVarN169, cpcVarN170, cpcVarN171, cpcVarN172, cpcVarN173, cpcVarN174, cpcVarN175, cpcVarN176, cpcVarN177, cpcVarN178, cpcVarN179, cpcVarN180, cpcVarN181, cpcVarN182, cpcVarN183, cpcVarN184, cpcVarN185, cpcVarN186, cpcVarN187, cpcVarN188, cpcVarN189, cpcVarN190, cpcVarN191, cpcVarN192, cpcVarN193, cpcVarN194, cpcVarN195, cpcVarN196, cpcVarN197, cpcVarN198, cpcVarN199, cpcVarN200, cpcVarN201, cpcVarN202, cpcVarN203, cpcVarN204, cpcVarN205, cpcVarN206, cpcVarN207, cpcVarN208, cpcVarN209, cpcVarN210, cpcVarN211, cpcVarN212, cpcVarN213, cpcVarN214, cpcVarN215, cpcVarN216, cpcVarN217, cpcVarN218, cpcVarN219, cpcVarN220, cpcVarN221, cpcVarN222, cpcVarN223, cpcVarN224, cpcVarN225, cpcVarN226, cpcVarN227, cpcVarN228, cpcVarN229, cpcVarN230, cpcVarN231, cpcVarN232, cpcVarN233, cpcVarN234, cpcVarN235, cpcVarN236, cpcVarN237, cpcVarN238, cpcVarN239, cpcVarN240, cpcVarN241, cpcVarN242, cpcVarN243, cpcVarN244, cpcVarN245, cpcVarN246, cpcVarN247, cpcVarN248, cpcVarN249, cpcVarN250, cpcVarN251, cpcVarN252, cpcVarN253, cpcVarN254, cpcVarN255, cpcVarN256, cpcVarN257, cpcVarN258, cpcVarN259, cpcVarX26, cpcVarX27, cpcVarX28, cpcVarN260, cpcVarN261, cpcVarN262, cpcVarN263, cpcVarN264, cpcVarN265, cpcVarN266, cpcVarN267, cpcVarN268, cpcVarN269, cpcVarN270, cpcVarN271, cpcVarN272, cpcVarN273, cpcVarN274, cpcVarN275, cpcVarN276, cpcVarN277, cpcVarN278, cpcVarN279, cpcVarN280, cpcVarN281, cpcVarN282, cpcVarN283, cpcVarN284, cpcVarN285, cpcVarN286, cpcVarN287, cpcVarN288, cpcVarN289, cpcVarN290, cpcVarN291, cpcVarN292, cpcVarN293, cpcVarN294, cpcVarN295, cpcVarN296, cpcVarN297, cpcVarN298, cpcVarN299, cpcVarN300, cpcVarN301, cpcVarN302, cpcVarN303, cpcVarN304, cpcVarN305, cpcVarN306, cpcVarN307, cpcVarN308, cpcVarX29, cpcVarX30, cpcVarX31, cpcVarX32, cpcVarX33, cpcVarX34, cpcVarX35, cpcVarX36, cpcVarX37, cpcVarX38, cpcVarX39, cpcVarX40, cpcVarX41, cpcVarX42, cpcVarX43, cpcVarX44, cpcVarX45, cpcVarX46, cpcVarX47, cpcVarX48, cpcVarX49, cpcVarX50, cpcVarX51, cpcVarX52, cpcVarX53, cpcVarX54, cpcVarX55, cpcVarX56, cpcVarX57, cpcVarX58, cpcVarX59, cpcVarX60, cpcVarX61, cpcVarX62, cpcVarX63, cpcVarX64, cpcVarX65, cpcVarX66, cpcVarX67, cpcVarX68, cpcVarX69, cpcVarX70, cpcVarX71, cpcVarX72, cpcVarX73, cpcVarX74, cpcVarX75, cpcVarX76, cpcVarX77, cpcVarX78, cpcVarX79, cpcVarX80, cpcVarX81, cpcVarX82, cpcVarX83, cpcVarX84, cpcVarX85, cpcVarX86, cpcVarX87, cpcVarX88, cpcVarX89, cpcVarX90, cpcVarX91, cpcVarX92, cpcVarX93, cpcVarN309, cpcVarN310, cpcVarX94, cpcVarN311, cpcVarN312, cpcVarN313, cpcVarN314, cpcVarN315, cpcVarN316, zh4.x("colon", new MTMathAtom(mTMathAtomType7, ":")), y6a.n(mTMathAtomType7, "·", "cdotp"), y6a.n(mTMathAtomType6, "°", "degree"), y6a.n(mTMathAtomType6, "¬", "neg"), y6a.n(mTMathAtomType6, "Å", "angstrom"), y6a.n(mTMathAtomType6, "å", "aa"), y6a.n(mTMathAtomType6, "æ", "ae"), y6a.n(mTMathAtomType6, "ø", "o"), y6a.n(mTMathAtomType6, "œ", "oe"), y6a.n(mTMathAtomType6, "ß", "ss"), y6a.n(mTMathAtomType6, "ç", "cc"), y6a.n(mTMathAtomType6, "Ç", "CC"), y6a.n(mTMathAtomType6, "Ø", "O"), y6a.n(mTMathAtomType6, "Æ", "AE"), y6a.n(mTMathAtomType6, "Œ", "OE"), y6a.n(mTMathAtomType6, "ƛ", "lbar"), y6a.n(mTMathAtomType6, "‖", "|"), y6a.n(mTMathAtomType6, "|", "vert"), y6a.n(mTMathAtomType2, "|", "lvert"), y6a.n(mTMathAtomType3, "|", "rvert"), y6a.n(mTMathAtomType2, "‖", "lVert"), y6a.n(mTMathAtomType3, "‖", "rVert"), y6a.n(mTMathAtomType6, "…", "ldots"), y6a.n(mTMathAtomType6, "′", "prime"), y6a.n(mTMathAtomType6, "ℏ", "hbar"), y6a.n(mTMathAtomType6, "ℑ", "Im"), y6a.n(mTMathAtomType6, "ℓ", "ell"), y6a.n(mTMathAtomType6, "℘", "wp"), y6a.n(mTMathAtomType6, "ℜ", "Re"), y6a.n(mTMathAtomType6, "℧", "mho"), y6a.n(mTMathAtomType6, "ℵ", "aleph"), y6a.n(mTMathAtomType6, "ℶ", "beth"), y6a.n(mTMathAtomType6, "ℷ", "gimel"), y6a.n(mTMathAtomType6, "ℸ", "daleth"), y6a.n(mTMathAtomType6, "∀", "forall"), y6a.n(mTMathAtomType6, "∃", "exists"), y6a.n(mTMathAtomType6, "∄", "nexists"), y6a.n(mTMathAtomType6, "∅", "emptyset"), y6a.n(mTMathAtomType6, "∅", "varnothing"), y6a.n(mTMathAtomType6, "∇", "nabla"), y6a.n(mTMathAtomType6, "∞", "infty"), y6a.n(mTMathAtomType6, "∠", "angle"), y6a.n(mTMathAtomType6, "∡", "measuredangle"), y6a.n(mTMathAtomType6, "⊤", "top"), y6a.n(mTMathAtomType6, "⊥", "bot"), y6a.n(mTMathAtomType6, "⋮", "vdots"), y6a.n(mTMathAtomType6, "⋯", "cdots"), y6a.n(mTMathAtomType6, "⋱", "ddots"), y6a.n(mTMathAtomType6, "△", "triangle"), y6a.n(mTMathAtomType6, "▽", "triangledown"), y6a.n(mTMathAtomType6, "▲", "blacktriangle"), y6a.n(mTMathAtomType6, "▼", "blacktriangledown"), y6a.n(mTMathAtomType6, "■", "blacksquare"), y6a.n(mTMathAtomType6, "□", "Box"), y6a.n(mTMathAtomType6, "◊", "lozenge"), y6a.n(mTMathAtomType6, "♦", "blacklozenge"), y6a.n(mTMathAtomType6, "∁", "complement"), y6a.n(mTMathAtomType6, "∢", "sphericalangle"), y6a.n(mTMathAtomType6, "‵", "backprime"), y6a.n(mTMathAtomType6, "√", "surd"), y6a.n(mTMathAtomType6, "✓", "checkmark"), y6a.n(mTMathAtomType6, "®", "circledR"), y6a.n(mTMathAtomType6, "✠", "maltese"), y6a.n(mTMathAtomType6, "¥", "yen"), y6a.n(mTMathAtomType6, "£", "pounds"), y6a.n(mTMathAtomType6, "ð", "eth"), y6a.n(mTMathAtomType6, "§", "S"), y6a.n(mTMathAtomType6, "¶", "P"), y6a.n(mTMathAtomType6, "♣", "clubsuit"), y6a.n(mTMathAtomType6, "♠", "spadesuit"), y6a.n(mTMathAtomType6, "♡", "heartsuit"), y6a.n(mTMathAtomType6, "♢", "diamondsuit"), y6a.n(mTMathAtomType6, "♭", "flat"), y6a.n(mTMathAtomType6, "♮", "natural"), y6a.n(mTMathAtomType6, "♯", "sharp"), y6a.n(mTMathAtomType6, "'", "upquote"), y6a.n(mTMathAtomType6, "𝚤", "imath"), y6a.n(mTMathAtomType6, "𝚥", "jmath"), y6a.n(mTMathAtomType6, "𝜕", "partial"), zh4.x(",", new MTMathSpace(3.0f)), zh4.x(">", new MTMathSpace(4.0f)), zh4.x(";", new MTMathSpace(5.0f)), zh4.x("!", new MTMathSpace(-3.0f)), zh4.x("quad", new MTMathSpace(18.0f)), zh4.x("qquad", new MTMathSpace(36.0f)), zh4.x("space", new MTMathSpace(6.0f)), zh4.x("nobreakspace", new MTMathSpace(6.0f)), zh4.x("allowbreak", new MTMathSpace(MTTypesetterKt.kLineSkipLimitMultiplier)), zh4.x("nobreak", new MTMathSpace(MTTypesetterKt.kLineSkipLimitMultiplier)), zh4.x("displaystyle", new MTMathStyle(MTLineStyle.KMTLineStyleDisplay)), zh4.x("textstyle", new MTMathStyle(MTLineStyle.KMTLineStyleText)), zh4.x("scriptstyle", new MTMathStyle(MTLineStyle.KMTLineStyleScript)), zh4.x("scriptscriptstyle", new MTMathStyle(MTLineStyle.KMTLineStyleScriptScript)));
        this.supportedLatexSymbols = mapG0;
        this.aliases = sta.g0(zh4.x("lnot", "neg"), zh4.x("land", "wedge"), zh4.x("lor", "vee"), zh4.x("ne", "neq"), zh4.x("le", "leq"), zh4.x("ge", "geq"), zh4.x("lbrace", "{"), zh4.x("rbrace", "}"), zh4.x("Vert", "|"), zh4.x("gets", "leftarrow"), zh4.x("to", "rightarrow"), zh4.x("iff", "Longleftrightarrow"), zh4.x("AA", "angstrom"), zh4.x("dots", "ldots"), zh4.x("bmod", "mod"), zh4.x("subseteqq", "subseteq"), zh4.x("supseteqq", "supseteq"), zh4.x("impliedby", "Longleftarrow"), zh4.x("Diamond", "lozenge"), zh4.x("owns", "ni"), zh4.x("varpropto", "propto"), zh4.x("thicksim", "sim"), zh4.x("thickapprox", "approx"), zh4.x("shortmid", "mid"), zh4.x("shortparallel", "parallel"), zh4.x("smallsetminus", "setminus"), zh4.x("hslash", "hbar"), zh4.x("mathellipsis", "ldots"), zh4.x("varvdots", "vdots"), zh4.x("Join", "bowtie"), zh4.x("doublecap", "Cap"), zh4.x("doublecup", "Cup"), zh4.x("doteqdot", "Doteq"), zh4.x("gggtr", "ggg"), zh4.x("llless", "lll"), zh4.x("leadsto", "rightsquigarrow"), zh4.x("restriction", "upharpoonright"), zh4.x("smallfrown", "frown"), zh4.x("smallsmile", "smile"), zh4.x("mathsterling", "pounds"), zh4.x("lhd", "vartriangleleft"), zh4.x("rhd", "vartriangleright"), zh4.x("unlhd", "trianglelefteq"), zh4.x("unrhd", "trianglerighteq"), zh4.x("bigtriangleup", "triangle"), zh4.x("bigtriangledown", "triangledown"), zh4.x("dag", "dagger"), zh4.x("ddag", "ddagger"), zh4.x("triangleleft", "vartriangleleft"), zh4.x("triangleright", "vartriangleright"));
        this.textToLatexSymbolNames = new HashMap<>();
        for (Map.Entry<String, MTMathAtom> entry : mapG0.entrySet()) {
            String key = entry.getKey();
            MTMathAtom value = entry.getValue();
            if (value.getNucleus().length() != 0 && ((str = this.textToLatexSymbolNames.get(value.getNucleus())) == null || (key.length() <= str.length() && (key.length() != str.length() || key.compareTo(str) <= 0)))) {
                this.textToLatexSymbolNames.put(value.getNucleus(), key);
            }
        }
        HashMap<String, String> mapG02 = sta.g0(zh4.x("grave", "̀"), zh4.x("acute", "́"), zh4.x("hat", "̂"), zh4.x("tilde", "̃"), zh4.x("bar", "̄"), zh4.x("breve", "̆"), zh4.x("dot", "̇"), zh4.x("ddot", "̈"), zh4.x("check", "̌"), zh4.x("mathring", "̊"), zh4.x("vec", "⃗"), zh4.x("widehat", "̂"), zh4.x("widetilde", "̃"));
        this.accents = mapG02;
        this.accentToCommands = new HashMap<>();
        for (Map.Entry<String, String> entry2 : mapG02.entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            String str2 = this.accentToCommands.get(value2);
            if (str2 == null || (key2.length() <= str2.length() && (key2.length() != str2.length() || key2.compareTo(str2) <= 0))) {
                this.accentToCommands.put(value2, key2);
            }
        }
        HashMap<String, String> mapG03 = sta.g0(zh4.x(".", ""), zh4.x("(", "("), zh4.x(")", ")"), zh4.x("[", "["), zh4.x("]", "]"), zh4.x("<", "〈"), zh4.x(">", "〉"), zh4.x("/", "/"), zh4.x("\\", "\\"), zh4.x("|", "|"), zh4.x("lgroup", "⟮"), zh4.x("rgroup", "⟯"), zh4.x("||", "‖"), zh4.x("Vert", "‖"), zh4.x("vert", "|"), zh4.x("uparrow", "↑"), zh4.x("downarrow", "↓"), zh4.x("updownarrow", "↕"), zh4.x("Uparrow", "⇑"), zh4.x("Downarrow", "⇓"), zh4.x("Updownarrow", "⇕"), zh4.x("backslash", "\\"), zh4.x("rangle", "〉"), zh4.x("langle", "〈"), zh4.x("rbrace", "}"), zh4.x("}", "}"), zh4.x("{", "{"), zh4.x("lbrace", "{"), zh4.x("lceil", "⌈"), zh4.x("rceil", "⌉"), zh4.x("lfloor", "⌊"), zh4.x("rfloor", "⌋"), zh4.x("lvert", "|"), zh4.x("rvert", "|"), zh4.x("lVert", "‖"), zh4.x("rVert", "‖"), zh4.x("ulcorner", "⌜"), zh4.x("urcorner", "⌝"), zh4.x("llcorner", "⌞"), zh4.x("lrcorner", "⌟"), zh4.x("llbracket", "⟦"), zh4.x("rrbracket", "⟧"), zh4.x("lbrack", "["), zh4.x("rbrack", "]"), zh4.x("lparen", "("), zh4.x("rparen", ")"));
        this.delimiters = mapG03;
        this.delimValueToName = new HashMap<>();
        for (Map.Entry<String, String> entry3 : mapG03.entrySet()) {
            String key3 = entry3.getKey();
            String value3 = entry3.getValue();
            String str3 = this.delimValueToName.get(value3);
            if (str3 == null || (key3.length() <= str3.length() && (key3.length() != str3.length() || key3.compareTo(str3) <= 0))) {
                this.delimValueToName.put(value3, key3);
            }
        }
    }

    private final MTMathAtom divide() {
        return new MTMathAtom(MTMathAtomType.KMTMathAtomBinaryOperator, "÷");
    }

    private final MTMathAtom placeholder() {
        return new MTMathAtom(MTMathAtomType.KMTMathAtomPlaceholder, "□");
    }

    private final MTFraction placeholderFraction() {
        MTFraction mTFraction = new MTFraction();
        mTFraction.setNumerator(placeholderList());
        mTFraction.setDenominator(placeholderList());
        return mTFraction;
    }

    private final MTMathList placeholderList() throws MathDisplayException {
        MTMathList mTMathList = new MTMathList(new MTMathAtom[0]);
        mTMathList.addAtom(placeholder());
        return mTMathList;
    }

    private final MTRadical placeholderRadical() {
        MTRadical mTRadical = new MTRadical();
        mTRadical.setDegree(placeholderList());
        mTRadical.setRadicand(placeholderList());
        return mTRadical;
    }

    private final MTRadical placeholderSquareRoot() {
        MTRadical mTRadical = new MTRadical();
        mTRadical.setRadicand(placeholderList());
        return mTRadical;
    }

    public final String accentName(MTAccent accent) {
        accent.getClass();
        return this.accentToCommands.get(accent.getNucleus());
    }

    public final MTAccent accentWithName(String accentName) {
        accentName.getClass();
        String str = this.accents.get(accentName);
        if (str != null) {
            return new MTAccent(str);
        }
        return null;
    }

    public final void addLatexSymbol(String name, MTMathAtom atom) {
        name.getClass();
        atom.getClass();
        this.supportedLatexSymbols.put(name, atom);
        if (atom.getNucleus().length() > 0) {
            this.textToLatexSymbolNames.put(atom.getNucleus(), name);
        }
    }

    public final MTMathAtom atomForLatexSymbolName(String symbolName) {
        symbolName.getClass();
        String str = this.aliases.get(symbolName);
        if (str != null) {
            symbolName = str;
        }
        MTMathAtom mTMathAtom = this.supportedLatexSymbols.get(symbolName);
        if (mTMathAtom != null) {
            return mTMathAtom.copyDeep();
        }
        return null;
    }

    public final MTMathAtom boundaryAtomForDelimiterName(String delimName) {
        delimName.getClass();
        String str = this.delimiters.get(delimName);
        if (str == null) {
            return null;
        }
        return new MTMathAtom(MTMathAtomType.KMTMathAtomBoundary, str);
    }

    public final String delimiterNameForBoundaryAtom(MTMathAtom boundary) {
        boundary.getClass();
        if (boundary.getType() != MTMathAtomType.KMTMathAtomBoundary) {
            return null;
        }
        return this.delimValueToName.get(boundary.getNucleus());
    }

    public final String fontNameForStyle(MTFontStyle fontStyle) {
        fontStyle.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[fontStyle.ordinal()]) {
            case 1:
                return "mathnormal";
            case 2:
                return "mathrm";
            case 3:
                return "mathbf";
            case 4:
                return "mathfrak";
            case 5:
                return "mathcal";
            case 6:
                return "mathit";
            case 7:
                return "mathsf";
            case 8:
                return "mathbb";
            case 9:
                return "mathtt";
            case 10:
                return "bm";
            default:
                wg6.i();
                return null;
        }
    }

    public final MTFraction fractionWithNumerator(String numStr, String denominatorStr) {
        numStr.getClass();
        denominatorStr.getClass();
        return fractionWithNumerator(mathListForCharacters(numStr), mathListForCharacters(denominatorStr));
    }

    public final HashMap<String, String> getAliases() {
        return this.aliases;
    }

    public final HashMap<String, MTFontStyle> getFontStyleWithName() {
        return this.fontStyleWithName;
    }

    public final String latexSymbolNameForAtom(MTMathAtom atom) {
        atom.getClass();
        if (atom.getNucleus().length() == 0) {
            return null;
        }
        return this.textToLatexSymbolNames.get(atom.getNucleus());
    }

    public final MTMathList mathListForCharacters(String chars) throws MathDisplayException {
        chars.getClass();
        MTMathList mTMathList = new MTMathList(new MTMathAtom[0]);
        int length = chars.length();
        for (int i = 0; i < length; i++) {
            MTMathAtom mTMathAtomAtomForCharacter = MTMathAtom.INSTANCE.atomForCharacter(chars.charAt(i));
            if (mTMathAtomAtomForCharacter != null) {
                mTMathList.addAtom(mTMathAtomAtomForCharacter);
            }
        }
        return mTMathList;
    }

    public final MTLargeOperator operatorWithName$mathdisplaylib(String name, boolean limits) {
        name.getClass();
        return new MTLargeOperator(name, limits);
    }

    public final List<String> supportedLatexSymbolNames() {
        Set<String> setKeySet = this.supportedLatexSymbols.keySet();
        setKeySet.getClass();
        return w44.h1(setKeySet);
    }

    public final MTMathAtom tableWithEnvironment(String env, List<List<MTMathList>> cells, MTParseError error) throws MathDisplayException {
        cells.getClass();
        error.getClass();
        MTMathTable mTMathTable = new MTMathTable(env);
        mTMathTable.setCells(cells);
        HashMap mapG0 = sta.g0(new cpc("matrix", new String[]{""}), new cpc("pmatrix", new String[]{"(", ")"}), new cpc("bmatrix", new String[]{"[", "]"}), new cpc("Bmatrix", new String[]{"{", "}"}), new cpc("vmatrix", new String[]{"vert", "vert"}), new cpc("Vmatrix", new String[]{"Vert", "Vert"}), new cpc("smallmatrix", new String[]{""}));
        int i = 0;
        if (mapG0.containsKey(env)) {
            mTMathTable.setEnvironment("matrix");
            boolean zR = x44.r(env, "smallmatrix");
            mTMathTable.setInterRowAdditionalSpacing(MTTypesetterKt.kLineSkipLimitMultiplier);
            mTMathTable.setInterColumnSpacing(zR ? 6.0f : 18.0f);
            MTMathStyle mTMathStyle = new MTMathStyle(zR ? MTLineStyle.KMTLineStyleScript : MTLineStyle.KMTLineStyleText);
            int size = mTMathTable.getCells().size();
            for (int i2 = 0; i2 < size; i2++) {
                List<MTMathList> list = mTMathTable.getCells().get(i2);
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    list.get(i3).insertAtom(mTMathStyle, 0);
                }
            }
            String[] strArr = (String[]) mapG0.get(env);
            if (strArr == null || strArr.length != 2) {
                return mTMathTable;
            }
            MTInner mTInner = new MTInner();
            mTInner.setLeftBoundary(boundaryAtomForDelimiterName(strArr[0]));
            mTInner.setRightBoundary(boundaryAtomForDelimiterName(strArr[1]));
            mTInner.setInnerList(new MTMathList(mTMathTable));
            return mTInner;
        }
        if (env == null) {
            mTMathTable.setInterRowAdditionalSpacing(1.0f);
            mTMathTable.setInterColumnSpacing(MTTypesetterKt.kLineSkipLimitMultiplier);
            int iNumColumns = mTMathTable.numColumns();
            while (i < iNumColumns) {
                mTMathTable.setAlignment(MTColumnAlignment.KMTColumnAlignmentLeft, i);
                i++;
            }
        } else {
            if (!env.equals("eqalign") && !env.equals("split") && !env.equals("aligned") && !env.equals("align")) {
                if (env.equals("displaylines") || env.equals("gather")) {
                    if (mTMathTable.numColumns() != 1) {
                        error.copyFrom(new MTParseError(MTParseErrors.InvalidNumColumns, env.concat(" environment can only have 1 column")));
                        return null;
                    }
                    mTMathTable.setInterRowAdditionalSpacing(1.0f);
                    mTMathTable.setInterColumnSpacing(MTTypesetterKt.kLineSkipLimitMultiplier);
                    mTMathTable.setAlignment(MTColumnAlignment.KMTColumnAlignmentCenter, 0);
                    return mTMathTable;
                }
                if (env.equals("eqnarray")) {
                    if (mTMathTable.numColumns() != 3) {
                        error.copyFrom(new MTParseError(MTParseErrors.InvalidNumColumns, "eqnarray environment can only have 3 columns"));
                        return null;
                    }
                    mTMathTable.setInterRowAdditionalSpacing(1.0f);
                    mTMathTable.setInterColumnSpacing(18.0f);
                    mTMathTable.setAlignment(MTColumnAlignment.KMTColumnAlignmentRight, 0);
                    mTMathTable.setAlignment(MTColumnAlignment.KMTColumnAlignmentCenter, 1);
                    mTMathTable.setAlignment(MTColumnAlignment.KMTColumnAlignmentLeft, 2);
                    return mTMathTable;
                }
                if (!env.equals("cases")) {
                    error.copyFrom(new MTParseError(MTParseErrors.InvalidEnv, "Unknown environment: ".concat(env)));
                    return null;
                }
                int iNumColumns2 = mTMathTable.numColumns();
                if (iNumColumns2 != 1 && iNumColumns2 != 2) {
                    error.copyFrom(new MTParseError(MTParseErrors.InvalidNumColumns, "cases environment can have 1 or 2 columns"));
                    return null;
                }
                mTMathTable.setInterRowAdditionalSpacing(MTTypesetterKt.kLineSkipLimitMultiplier);
                mTMathTable.setInterColumnSpacing(18.0f);
                MTColumnAlignment mTColumnAlignment = MTColumnAlignment.KMTColumnAlignmentLeft;
                mTMathTable.setAlignment(mTColumnAlignment, 0);
                if (iNumColumns2 == 2) {
                    mTMathTable.setAlignment(mTColumnAlignment, 1);
                }
                MTMathStyle mTMathStyle2 = new MTMathStyle(MTLineStyle.KMTLineStyleText);
                int size3 = mTMathTable.getCells().size();
                for (int i4 = 0; i4 < size3; i4++) {
                    List<MTMathList> list2 = mTMathTable.getCells().get(i4);
                    int size4 = list2.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        list2.get(i5).insertAtom(mTMathStyle2, 0);
                    }
                }
                MTInner mTInner2 = new MTInner();
                mTInner2.setLeftBoundary(boundaryAtomForDelimiterName("{"));
                mTInner2.setRightBoundary(boundaryAtomForDelimiterName("."));
                MTMathAtom mTMathAtomAtomForLatexSymbolName = atomForLatexSymbolName(",");
                if (mTMathAtomAtomForLatexSymbolName != null) {
                    mTInner2.setInnerList(new MTMathList(mTMathAtomAtomForLatexSymbolName, mTMathTable));
                }
                return mTInner2;
            }
            if (env.equals("split") && mTMathTable.numColumns() > 2) {
                error.copyFrom(new MTParseError(MTParseErrors.InvalidNumColumns, "split environment can have at most 2 columns"));
                return null;
            }
            MTMathAtom mTMathAtom = new MTMathAtom(MTMathAtomType.KMTMathAtomOrdinary, "");
            int size5 = mTMathTable.getCells().size();
            for (int i6 = 0; i6 < size5; i6++) {
                List<MTMathList> list3 = mTMathTable.getCells().get(i6);
                for (int i7 = 1; i7 < list3.size(); i7 += 2) {
                    list3.get(i7).insertAtom(mTMathAtom, 0);
                }
            }
            mTMathTable.setInterRowAdditionalSpacing(1.0f);
            mTMathTable.setInterColumnSpacing(MTTypesetterKt.kLineSkipLimitMultiplier);
            int iNumColumns3 = mTMathTable.numColumns();
            while (i < iNumColumns3) {
                mTMathTable.setAlignment(i % 2 == 0 ? MTColumnAlignment.KMTColumnAlignmentRight : MTColumnAlignment.KMTColumnAlignmentLeft, i);
                i++;
            }
        }
        return mTMathTable;
    }

    public final MTMathAtom times() {
        return new MTMathAtom(MTMathAtomType.KMTMathAtomBinaryOperator, "×");
    }

    private final MTFraction fractionWithNumerator(MTMathList num, MTMathList denom) {
        MTFraction mTFraction = new MTFraction();
        mTFraction.setNumerator(num);
        mTFraction.setDenominator(denom);
        return mTFraction;
    }
}
