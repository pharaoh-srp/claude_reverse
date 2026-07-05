package com.agog.mathdisplay.parse;

import com.agog.mathdisplay.parse.MTMathAtom;
import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.cpc;
import defpackage.grc;
import defpackage.ij0;
import defpackage.isg;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mp0;
import defpackage.mq5;
import defpackage.sf5;
import defpackage.sta;
import defpackage.x44;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 f2\u00020\u0001:\u0001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u0011\u0010 \u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b \u0010\u0016J\u0011\u0010!\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b!\u0010\u0016J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020#2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u0004\u0018\u00010#2\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010%J)\u0010/\u001a\u0004\u0018\u00010\u00102\u0006\u0010,\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100J!\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00107\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0002H\u0002¢\u0006\u0004\b7\u00108J-\u0010<\u001a\u0004\u0018\u00010#2\b\u00109\u001a\u0004\u0018\u00010\u00022\b\u0010:\u001a\u0004\u0018\u00010\u00102\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0006¢\u0006\u0004\bD\u0010\bR\u0016\u0010E\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R<\u0010_\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020Z0]j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020Z`^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R \u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020b0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010d¨\u0006g"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathListBuilder;", "", "", "str", "<init>", "(Ljava/lang/String;)V", "", "hasCharacters", "()Z", "", "getNextCharacter", "()C", "Liei;", "unlookCharacter", "()V", "oneCharOnly", "Lcom/agog/mathdisplay/parse/MTMathList;", "buildInternal", "(Z)Lcom/agog/mathdisplay/parse/MTMathList;", "stopChar", "(ZC)Lcom/agog/mathdisplay/parse/MTMathList;", "readString", "()Ljava/lang/String;", "peekNextCommand", "consumeNextCommand", "readColor", "ch", "nonSpaceChar", "(C)Z", "skipSpaces", "expectCharacter", "readCommand", "readDelimiter", "readEnvironment", "delimiterType", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "getBoundaryAtom", "(Ljava/lang/String;)Lcom/agog/mathdisplay/parse/MTMathAtom;", "atom", "Lcom/agog/mathdisplay/parse/MTLineStyle;", "style", "Lcom/agog/mathdisplay/parse/MTInner;", "wrapAtomWithStyle", "(Lcom/agog/mathdisplay/parse/MTMathAtom;Lcom/agog/mathdisplay/parse/MTLineStyle;)Lcom/agog/mathdisplay/parse/MTInner;", "command", "atomForCommand", "list", "stopCommand", "(Ljava/lang/String;Lcom/agog/mathdisplay/parse/MTMathList;C)Lcom/agog/mathdisplay/parse/MTMathList;", "modifier", "applyModifier", "(Ljava/lang/String;Lcom/agog/mathdisplay/parse/MTMathAtom;)Z", "Lcom/agog/mathdisplay/parse/MTParseErrors;", "errorcode", "message", "setError", "(Lcom/agog/mathdisplay/parse/MTParseErrors;Ljava/lang/String;)V", "env", "firstList", "isRow", "buildTable", "(Ljava/lang/String;Lcom/agog/mathdisplay/parse/MTMathList;Z)Lcom/agog/mathdisplay/parse/MTMathAtom;", "build", "()Lcom/agog/mathdisplay/parse/MTMathList;", "Lcom/agog/mathdisplay/parse/MTParseError;", "dst", "copyError", "(Lcom/agog/mathdisplay/parse/MTParseError;)V", "errorActive", "chars", "Ljava/lang/String;", "", "currentCharIndex", "I", "charlength", "currentInnerAtom", "Lcom/agog/mathdisplay/parse/MTInner;", "Lcom/agog/mathdisplay/parse/MTEnvProperties;", "currentEnv", "Lcom/agog/mathdisplay/parse/MTEnvProperties;", "Lcom/agog/mathdisplay/parse/MTFontStyle;", "currentFontStyle", "Lcom/agog/mathdisplay/parse/MTFontStyle;", "spacesAllowed", "Z", "parseerror", "Lcom/agog/mathdisplay/parse/MTParseError;", "", "starredCommands", "Ljava/util/Set;", "", "singleCharCommands", "[Ljava/lang/Character;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "fractionCommands", "Ljava/util/HashMap;", "", "", "delimiterSizeCommands", "Ljava/util/Map;", "notCombinations", "Factory", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTMathListBuilder {

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HashMap<Float, String> spaceToCommands = sta.g0(new cpc(Float.valueOf(3.0f), ","), new cpc(Float.valueOf(4.0f), ">"), new cpc(Float.valueOf(5.0f), ";"), new cpc(Float.valueOf(-3.0f), "!"), new cpc(Float.valueOf(18.0f), "quad"), new cpc(Float.valueOf(36.0f), "qquad"), new cpc(Float.valueOf(6.0f), "space"), new cpc(Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier), "allowbreak"));
    private static final HashMap<MTLineStyle, String> styleToCommands = sta.g0(new cpc(MTLineStyle.KMTLineStyleDisplay, "displaystyle"), new cpc(MTLineStyle.KMTLineStyleText, "textstyle"), new cpc(MTLineStyle.KMTLineStyleScript, "scriptstyle"), new cpc(MTLineStyle.KMTLineStyleScriptScript, "scriptscriptstyle"));
    private int charlength;
    private String chars;
    private int currentCharIndex;
    private MTEnvProperties currentEnv;
    private MTFontStyle currentFontStyle;
    private MTInner currentInnerAtom;
    private final Map<String, Float> delimiterSizeCommands;
    private final HashMap<String, String[]> fractionCommands;
    private final Map<String, String> notCombinations;
    private MTParseError parseerror;
    private Character[] singleCharCommands;
    private boolean spacesAllowed;
    private final Set<String> starredCommands;

    public MTMathListBuilder(String str) {
        str.getClass();
        this.chars = str;
        this.charlength = str.length();
        this.currentFontStyle = MTFontStyle.KMTFontStyleDefault;
        this.starredCommands = sf5.f0("operatorname");
        this.singleCharCommands = new Character[]{'{', '}', '$', '#', '%', '_', '|', ' ', ',', '>', ';', '!', '\\'};
        this.fractionCommands = sta.g0(new cpc("over", new String[]{""}), new cpc("atop", new String[]{""}), new cpc("choose", new String[]{"(", ")"}), new cpc("brack", new String[]{"[", "]"}), new cpc("brace", new String[]{"{", "}"}));
        Float fValueOf = Float.valueOf(1.0f);
        cpc cpcVar = new cpc("big", fValueOf);
        cpc cpcVar2 = new cpc("bigl", fValueOf);
        cpc cpcVar3 = new cpc("bigr", fValueOf);
        cpc cpcVar4 = new cpc("bigm", fValueOf);
        Float fValueOf2 = Float.valueOf(1.4f);
        cpc cpcVar5 = new cpc("Big", fValueOf2);
        cpc cpcVar6 = new cpc("Bigl", fValueOf2);
        cpc cpcVar7 = new cpc("Bigr", fValueOf2);
        cpc cpcVar8 = new cpc("Bigm", fValueOf2);
        Float fValueOf3 = Float.valueOf(1.8f);
        cpc cpcVar9 = new cpc("bigg", fValueOf3);
        cpc cpcVar10 = new cpc("biggl", fValueOf3);
        cpc cpcVar11 = new cpc("biggr", fValueOf3);
        cpc cpcVar12 = new cpc("biggm", fValueOf3);
        Float fValueOf4 = Float.valueOf(2.2f);
        this.delimiterSizeCommands = sta.h0(cpcVar, cpcVar2, cpcVar3, cpcVar4, cpcVar5, cpcVar6, cpcVar7, cpcVar8, cpcVar9, cpcVar10, cpcVar11, cpcVar12, new cpc("Bigg", fValueOf4), new cpc("Biggl", fValueOf4), new cpc("Biggr", fValueOf4), new cpc("Biggm", fValueOf4));
        this.notCombinations = sta.h0(new cpc("equiv", "≢"), new cpc("subset", "⊄"), new cpc("in", "∉"), new cpc("sim", "≁"), new cpc("approx", "≉"), new cpc("cong", "≇"), new cpc("parallel", "∦"), new cpc("subseteq", "⊈"), new cpc("supset", "⊅"), new cpc("supseteq", "⊉"), new cpc("=", "≠"));
    }

    private final boolean applyModifier(String modifier, MTMathAtom atom) {
        if (x44.r(modifier, "limits")) {
            if (atom == null || atom.getType() != MTMathAtomType.KMTMathAtomLargeOperator) {
                setError(MTParseErrors.InvalidLimits, "limits can only be applied to an operator.");
            } else {
                ((MTLargeOperator) atom).setHasLimits(true);
            }
            return true;
        }
        if (!x44.r(modifier, "nolimits")) {
            return false;
        }
        if (atom == null || atom.getType() != MTMathAtomType.KMTMathAtomLargeOperator) {
            setError(MTParseErrors.InvalidLimits, "nolimits can only be applied to an operator.");
            return true;
        }
        ((MTLargeOperator) atom).setHasLimits(false);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0348, code lost:
    
        if (r17.equals("operatorname") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x034c, code lost:
    
        r1 = defpackage.isg.h0(r17, "*", false);
        r2 = r16.spacesAllowed;
        r16.spacesAllowed = true;
        r3 = buildInternal(true);
        r16.spacesAllowed = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x035c, code lost:
    
        if (r3 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0360, code lost:
    
        r2 = new java.lang.StringBuilder();
        r3 = r3.getAtoms().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0371, code lost:
    
        if (r3.hasNext() == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0373, code lost:
    
        r2.append(r3.next().getNucleus());
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0385, code lost:
    
        if (r2.length() != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0387, code lost:
    
        setError(com.agog.mathdisplay.parse.MTParseErrors.InvalidCommand, "Missing operator name for \\operatorname");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x038e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0398, code lost:
    
        return new com.agog.mathdisplay.parse.MTLargeOperator(r2.toString(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r17.equals("operatorname*") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0445, code lost:
    
        if (r17.equals("tbinom") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x049e, code lost:
    
        if (r17.equals("dbinom") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04a2, code lost:
    
        r2 = new com.agog.mathdisplay.parse.MTFraction(false);
        r2.setNumerator(buildInternal(true));
        r2.setDenominator(buildInternal(true));
        r2.setLeftDelimiter("(");
        r2.setRightDelimiter(")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04bf, code lost:
    
        if (r17.equals("binom") == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04c1, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04c6, code lost:
    
        if (r17.equals("dbinom") == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04c8, code lost:
    
        r1 = com.agog.mathdisplay.parse.MTLineStyle.KMTLineStyleDisplay;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04cb, code lost:
    
        r1 = com.agog.mathdisplay.parse.MTLineStyle.KMTLineStyleText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04d1, code lost:
    
        return wrapAtomWithStyle(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (r17.equals("tfrac") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
    
        if (r17.equals("dfrac") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        r2 = new com.agog.mathdisplay.parse.MTFraction();
        r2.setNumerator(buildInternal(true));
        r2.setDenominator(buildInternal(true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
    
        if (r17.equals("dfrac") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        r1 = com.agog.mathdisplay.parse.MTLineStyle.KMTLineStyleDisplay;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        r1 = com.agog.mathdisplay.parse.MTLineStyle.KMTLineStyleText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        return wrapAtomWithStyle(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a6, code lost:
    
        if (r17.equals("binom") == false) goto L261;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.agog.mathdisplay.parse.MTMathAtom atomForCommand(java.lang.String r17) throws com.agog.mathdisplay.parse.MathDisplayException {
        /*
            Method dump skipped, instruction units count: 1672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.agog.mathdisplay.parse.MTMathListBuilder.atomForCommand(java.lang.String):com.agog.mathdisplay.parse.MTMathAtom");
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x025a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        unlookCharacter();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.agog.mathdisplay.parse.MTMathList] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.agog.mathdisplay.parse.MTMathListBuilder] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.agog.mathdisplay.parse.MTMathAtom] */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.agog.mathdisplay.parse.MTMathAtom] */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.agog.mathdisplay.parse.MTMathAtom] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.agog.mathdisplay.parse.MTMathAtom] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v27, types: [com.agog.mathdisplay.parse.MTInner, com.agog.mathdisplay.parse.MTMathAtom] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.agog.mathdisplay.parse.MTMathList buildInternal(boolean r12, char r13) throws com.agog.mathdisplay.parse.MathDisplayException {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.agog.mathdisplay.parse.MTMathListBuilder.buildInternal(boolean, char):com.agog.mathdisplay.parse.MTMathList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[ADDED_TO_REGION, EDGE_INSN: B:33:0x0079->B:20:0x0079 BREAK  A[LOOP:0: B:10:0x0044->B:37:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006b -> B:7:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.agog.mathdisplay.parse.MTMathAtom buildTable(java.lang.String r9, com.agog.mathdisplay.parse.MTMathList r10, boolean r11) throws com.agog.mathdisplay.parse.MathDisplayException {
        /*
            r8 = this;
            com.agog.mathdisplay.parse.MTEnvProperties r0 = r8.currentEnv
            com.agog.mathdisplay.parse.MTEnvProperties r1 = new com.agog.mathdisplay.parse.MTEnvProperties
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r2 = r9
            r1.<init>(r2, r3, r4, r6, r7)
            r8.currentEnv = r1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.add(r3, r2)
            r2 = 1
            if (r10 == 0) goto L42
            java.lang.Object r4 = r9.get(r3)
            java.util.List r4 = (java.util.List) r4
            r4.add(r3, r10)
            if (r11 == 0) goto L3f
            long r10 = r1.getNumRows()
            r4 = 1
            long r10 = r10 + r4
            r1.setNumRows(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r9.add(r2, r10)
            r10 = r2
        L3d:
            r11 = r3
            goto L44
        L3f:
            r11 = r2
            r10 = r3
            goto L44
        L42:
            r10 = r3
            r11 = r10
        L44:
            boolean r4 = r1.getEnded()
            r5 = 0
            if (r4 != 0) goto L79
            boolean r4 = r8.hasCharacters()
            if (r4 == 0) goto L79
            com.agog.mathdisplay.parse.MTMathList r4 = r8.buildInternal(r3)
            if (r4 != 0) goto L58
            return r5
        L58:
            java.lang.Object r5 = r9.get(r10)
            java.util.List r5 = (java.util.List) r5
            r5.add(r11, r4)
            int r11 = r11 + r2
            long r4 = r1.getNumRows()
            long r6 = (long) r10
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L44
            long r10 = r1.getNumRows()
            int r10 = (int) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r9.add(r10, r11)
            goto L3d
        L79:
            boolean r10 = r1.getEnded()
            if (r10 != 0) goto L8d
            java.lang.String r10 = r1.getEnvName()
            if (r10 == 0) goto L8d
            com.agog.mathdisplay.parse.MTParseErrors r9 = com.agog.mathdisplay.parse.MTParseErrors.MissingEnd
            java.lang.String r10 = "Missing \\end"
            r8.setError(r9, r10)
            return r5
        L8d:
            com.agog.mathdisplay.parse.MTParseError r10 = new com.agog.mathdisplay.parse.MTParseError
            r11 = 3
            r10.<init>(r5, r5, r11, r5)
            com.agog.mathdisplay.parse.MTMathAtom$Factory r11 = com.agog.mathdisplay.parse.MTMathAtom.INSTANCE
            java.lang.String r1 = r1.getEnvName()
            com.agog.mathdisplay.parse.MTMathAtom r9 = r11.tableWithEnvironment(r1, r9, r10)
            if (r9 != 0) goto La2
            r8.parseerror = r10
            return r5
        La2:
            r8.currentEnv = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.agog.mathdisplay.parse.MTMathListBuilder.buildTable(java.lang.String, com.agog.mathdisplay.parse.MTMathList, boolean):com.agog.mathdisplay.parse.MTMathAtom");
    }

    private final void consumeNextCommand() throws MathDisplayException {
        skipSpaces();
        if (hasCharacters() && getNextCharacter() == '\\') {
            readCommand();
        }
    }

    private final boolean expectCharacter(char ch) throws MathDisplayException {
        if (nonSpaceChar(ch)) {
            throw new MathDisplayException("Expected non space character " + ch);
        }
        skipSpaces();
        if (!hasCharacters()) {
            return false;
        }
        char nextCharacter = getNextCharacter();
        if (nonSpaceChar(nextCharacter)) {
            throw new MathDisplayException("Expected non space character " + nextCharacter);
        }
        if (nextCharacter == ch) {
            return true;
        }
        unlookCharacter();
        return false;
    }

    private final MTMathAtom getBoundaryAtom(String delimiterType) throws MathDisplayException {
        String delimiter = readDelimiter();
        if (delimiter == null) {
            setError(MTParseErrors.MissingDelimiter, ij0.i("Missing delimiter for ", delimiterType));
            return null;
        }
        MTMathAtom mTMathAtomBoundaryAtomForDelimiterName = MTMathAtom.INSTANCE.boundaryAtomForDelimiterName(delimiter);
        if (mTMathAtomBoundaryAtomForDelimiterName != null) {
            return mTMathAtomBoundaryAtomForDelimiterName;
        }
        setError(MTParseErrors.InvalidDelimiter, ij0.k("Invalid delimiter for ", delimiterType, ": ", delimiter));
        return null;
    }

    private final char getNextCharacter() {
        int i = this.currentCharIndex;
        int i2 = this.charlength;
        if (i >= i2) {
            setError(MTParseErrors.InternalError, grc.o(i, i2, "Retrieving character at index ", " beyond length "));
            return ' ';
        }
        String str = this.chars;
        this.currentCharIndex = i + 1;
        return str.charAt(i);
    }

    private final boolean hasCharacters() {
        return this.currentCharIndex < this.charlength;
    }

    private final boolean nonSpaceChar(char ch) {
        return ch < '!' || ch > '~';
    }

    private final String peekNextCommand() throws MathDisplayException {
        int i = this.currentCharIndex;
        skipSpaces();
        if (!hasCharacters()) {
            this.currentCharIndex = i;
            return "";
        }
        char nextCharacter = getNextCharacter();
        String command = nextCharacter == '\\' ? readCommand() : String.valueOf(nextCharacter);
        this.currentCharIndex = i;
        return command;
    }

    private final String readColor() throws MathDisplayException {
        if (!expectCharacter('{')) {
            setError(MTParseErrors.CharacterNotFound, "Missing {");
            return null;
        }
        skipSpaces();
        StringBuilder sb = new StringBuilder();
        while (hasCharacters()) {
            char nextCharacter = getNextCharacter();
            if (nextCharacter != '#' && (('A' > nextCharacter || nextCharacter >= '[') && (('a' > nextCharacter || nextCharacter >= '{') && ('0' > nextCharacter || nextCharacter >= ':')))) {
                unlookCharacter();
                break;
            }
            sb.append(nextCharacter);
        }
        if (!expectCharacter('}')) {
            setError(MTParseErrors.CharacterNotFound, "Missing }");
            return null;
        }
        String string = sb.toString();
        if (isg.q0(string, "#", false)) {
            String strSubstring = string.substring(1);
            if (strSubstring.length() == 6 || strSubstring.length() == 8) {
                for (int i = 0; i < strSubstring.length(); i++) {
                    char cCharAt = strSubstring.charAt(i);
                    if (('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < 'g') || ('A' <= cCharAt && cCharAt < 'G'))) {
                    }
                }
            }
            setError(MTParseErrors.InvalidCommand, "Invalid hex color: ".concat(string));
            return null;
        }
        return string;
    }

    private final String readCommand() throws MathDisplayException {
        if (hasCharacters()) {
            char nextCharacter = getNextCharacter();
            if (mp0.o0(Character.valueOf(nextCharacter), this.singleCharCommands)) {
                return String.valueOf(nextCharacter);
            }
            unlookCharacter();
        }
        String string = readString();
        if (this.starredCommands.contains(string) && hasCharacters()) {
            if (getNextCharacter() == '*') {
                return kgh.o(string, "*");
            }
            unlookCharacter();
        }
        return string;
    }

    private final String readDelimiter() throws MathDisplayException {
        skipSpaces();
        if (!hasCharacters()) {
            return null;
        }
        char nextCharacter = getNextCharacter();
        if (nonSpaceChar(nextCharacter)) {
            throw new MathDisplayException("Expected non space character " + nextCharacter);
        }
        if (nextCharacter != '\\') {
            return String.valueOf(nextCharacter);
        }
        String command = readCommand();
        return x44.r(command, "|") ? "||" : command;
    }

    private final String readEnvironment() throws MathDisplayException {
        if (!expectCharacter('{')) {
            setError(MTParseErrors.CharacterNotFound, "Missing {");
            return null;
        }
        skipSpaces();
        String string = readString();
        if (expectCharacter('}')) {
            return string;
        }
        setError(MTParseErrors.CharacterNotFound, "Missing }");
        return null;
    }

    private final String readString() throws MathDisplayException {
        StringBuilder sb = new StringBuilder();
        while (hasCharacters()) {
            char nextCharacter = getNextCharacter();
            if (('a' > nextCharacter || nextCharacter >= '{') && ('A' > nextCharacter || nextCharacter >= '[')) {
                unlookCharacter();
                break;
            }
            sb.append(nextCharacter);
        }
        return sb.toString();
    }

    private final void setError(MTParseErrors errorcode, String message) {
        if (this.parseerror == null) {
            this.parseerror = new MTParseError(errorcode, message);
        }
    }

    private final void skipSpaces() throws MathDisplayException {
        while (hasCharacters()) {
            if (!nonSpaceChar(getNextCharacter())) {
                unlookCharacter();
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r7.equals("brack") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r7.equals("brace") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r7.equals("over") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r7.equals("atop") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        if (r7.equals("cr") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c1, code lost:
    
        if (r7.equals("\\") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c4, code lost:
    
        r7 = r6.currentEnv;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c6, code lost:
    
        if (r7 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c8, code lost:
    
        r7.setNumRows(r7.getNumRows() + 1);
        r6.currentEnv = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d5, code lost:
    
        r6 = buildTable(null, r8, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d9, code lost:
    
        if (r6 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ec, code lost:
    
        if (r7.equals("choose") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f4, code lost:
    
        if (r7.equals("over") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f6, code lost:
    
        r0 = new com.agog.mathdisplay.parse.MTFraction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fc, code lost:
    
        r0 = new com.agog.mathdisplay.parse.MTFraction(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0101, code lost:
    
        r7 = r6.fractionCommands.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0109, code lost:
    
        if (r7 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010d, code lost:
    
        if (r7.length != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010f, code lost:
    
        r0.setLeftDelimiter(r7[0]);
        r0.setRightDelimiter(r7[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0119, code lost:
    
        r0.setNumerator(r8);
        r0.setDenominator(buildInternal(false, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0127, code lost:
    
        if (errorActive() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012a, code lost:
    
        r6 = new com.agog.mathdisplay.parse.MTMathList(new com.agog.mathdisplay.parse.MTMathAtom[0]);
        r6.addAtom(r0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.agog.mathdisplay.parse.MTMathList stopCommand(java.lang.String r7, com.agog.mathdisplay.parse.MTMathList r8, char r9) throws com.agog.mathdisplay.parse.MathDisplayException {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.agog.mathdisplay.parse.MTMathListBuilder.stopCommand(java.lang.String, com.agog.mathdisplay.parse.MTMathList, char):com.agog.mathdisplay.parse.MTMathList");
    }

    private final void unlookCharacter() throws MathDisplayException {
        int i = this.currentCharIndex;
        if (i <= 0) {
            throw new MathDisplayException("Unlooking when at the first character.");
        }
        this.currentCharIndex = i - 1;
    }

    private final MTInner wrapAtomWithStyle(MTMathAtom atom, MTLineStyle style) {
        MTInner mTInner = new MTInner();
        mTInner.setInnerList(new MTMathList(new MTMathStyle(style), atom));
        return mTInner;
    }

    public final MTMathList build() {
        MTMathList mTMathListBuildInternal = buildInternal(false);
        if (!hasCharacters()) {
            return mTMathListBuildInternal;
        }
        setError(MTParseErrors.MismatchBraces, ij0.i("Mismatched braces: ", this.chars));
        return null;
    }

    public final void copyError(MTParseError dst) {
        dst.getClass();
        dst.copyFrom(this.parseerror);
    }

    public final boolean errorActive() {
        return this.parseerror != null;
    }

    /* JADX INFO: renamed from: com.agog.mathdisplay.parse.MTMathListBuilder$Factory, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0005R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007`\rX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000bj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathListBuilder$Factory;", "", "<init>", "()V", "buildFromString", "Lcom/agog/mathdisplay/parse/MTMathList;", "str", "", "error", "Lcom/agog/mathdisplay/parse/MTParseError;", "spaceToCommands", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "styleToCommands", "Lcom/agog/mathdisplay/parse/MTLineStyle;", "delimToLatexString", "delim", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "toLatexString", "ml", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class Companion {

        /* JADX INFO: renamed from: com.agog.mathdisplay.parse.MTMathListBuilder$Factory$WhenMappings */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = mdj.f)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MTMathAtomType.values().length];
                try {
                    iArr[MTMathAtomType.KMTMathAtomOpen.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomClose.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomRelation.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        private final String delimToLatexString(MTMathAtom delim) {
            String strDelimiterNameForBoundaryAtom = MTMathAtom.INSTANCE.delimiterNameForBoundaryAtom(delim);
            return strDelimiterNameForBoundaryAtom != null ? mp0.o0(strDelimiterNameForBoundaryAtom, new String[]{"(", ")", "[", "]", "<", ">", "|", ".", "/"}) ? strDelimiterNameForBoundaryAtom : strDelimiterNameForBoundaryAtom.equals("||") ? "\\|" : "\\".concat(strDelimiterNameForBoundaryAtom) : "";
        }

        public final MTMathList buildFromString(String str, MTParseError error) {
            str.getClass();
            error.getClass();
            MTMathListBuilder mTMathListBuilder = new MTMathListBuilder(str);
            MTMathList mTMathListBuild = mTMathListBuilder.build();
            if (!mTMathListBuilder.errorActive()) {
                return mTMathListBuild;
            }
            mTMathListBuilder.copyError(error);
            return null;
        }

        public final String toLatexString(MTMathList ml) {
            String strDelimToLatexString;
            ml.getClass();
            StringBuilder sb = new StringBuilder();
            MTFontStyle fontStyle = MTFontStyle.KMTFontStyleDefault;
            for (MTMathAtom mTMathAtom : ml.getAtoms()) {
                if (fontStyle != mTMathAtom.getFontStyle()) {
                    MTFontStyle mTFontStyle = MTFontStyle.KMTFontStyleDefault;
                    if (fontStyle != mTFontStyle) {
                        sb.append("}");
                    }
                    if (mTMathAtom.getFontStyle() != mTFontStyle) {
                        sb.append("\\" + MTMathAtom.INSTANCE.fontNameForStyle(mTMathAtom.getFontStyle()) + "{");
                    }
                    fontStyle = mTMathAtom.getFontStyle();
                }
                strDelimToLatexString = "";
                if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomFraction) {
                    MTFraction mTFraction = (MTFraction) mTMathAtom;
                    MTMathList numerator = mTFraction.getNumerator();
                    String latexString = numerator != null ? toLatexString(numerator) : "";
                    MTMathList denominator = mTFraction.getDenominator();
                    String latexString2 = denominator != null ? toLatexString(denominator) : "";
                    if (mTFraction.getIsContinuedFraction()) {
                        StringBuilder sbR = kgh.r("\\cfrac", x44.r(mTFraction.getAlignment(), "c") ? "" : ij0.j("[", mTFraction.getAlignment(), "]"), "{", latexString, "}{");
                        sbR.append(latexString2);
                        sbR.append("}");
                        sb.append(sbR.toString());
                    } else if (mTFraction.getHasRule()) {
                        sb.append(ij0.l("\\frac{", latexString, "}{", latexString2, "}"));
                    } else {
                        StringBuilder sbR2 = kgh.r("{", latexString, " \\", (mTFraction.getLeftDelimiter() == null && mTFraction.getRightDelimiter() == null) ? "atop" : (x44.r(mTFraction.getLeftDelimiter(), "(") && x44.r(mTFraction.getRightDelimiter(), ")")) ? "choose" : (x44.r(mTFraction.getLeftDelimiter(), "{") && x44.r(mTFraction.getRightDelimiter(), "}")) ? "brace" : (x44.r(mTFraction.getLeftDelimiter(), "[") && x44.r(mTFraction.getRightDelimiter(), "]")) ? "brack" : ij0.j("atopwithdelims", mTFraction.getLeftDelimiter(), mTFraction.getRightDelimiter()), " ");
                        sbR2.append(latexString2);
                        sbR2.append("}");
                        sb.append(sbR2.toString());
                    }
                } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomRadical) {
                    sb.append(((MTRadical) mTMathAtom).toLatexString());
                } else {
                    int i = 1;
                    if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomInner) {
                        MTInner mTInner = (MTInner) mTMathAtom;
                        MTMathAtom leftBoundary = mTInner.getLeftBoundary();
                        MTMathAtom rightBoundary = mTInner.getRightBoundary();
                        Float delimiterHeight = mTInner.getDelimiterHeight();
                        if (delimiterHeight != null) {
                            String str = x44.p(delimiterHeight, 1.0f) ? "big" : x44.p(delimiterHeight, 1.4f) ? "Big" : x44.p(delimiterHeight, 1.8f) ? "bigg" : "Bigg";
                            MTMathAtomType sizedDelimiterType = mTInner.getSizedDelimiterType();
                            int i2 = sizedDelimiterType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sizedDelimiterType.ordinal()];
                            String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? "" : "m" : "r" : "l";
                            if (rightBoundary != null && rightBoundary.getNucleus().length() > 0) {
                                strDelimToLatexString = delimToLatexString(rightBoundary);
                            } else if (leftBoundary != null) {
                                strDelimToLatexString = delimToLatexString(leftBoundary);
                            }
                            sb.append(ij0.l("\\", str, str2, strDelimToLatexString, " "));
                        } else if (leftBoundary == null && rightBoundary == null) {
                            sb.append("{");
                            MTMathList innerList = mTInner.getInnerList();
                            if (innerList != null) {
                                sb.append(toLatexString(innerList));
                            }
                            sb.append("}");
                        } else {
                            if (leftBoundary != null) {
                                sb.append("\\left" + delimToLatexString(leftBoundary) + " ");
                            } else {
                                sb.append("\\left. ");
                            }
                            MTMathList innerList2 = mTInner.getInnerList();
                            if (innerList2 != null) {
                                sb.append(toLatexString(innerList2));
                            }
                            if (rightBoundary != null) {
                                sb.append("\\right" + delimToLatexString(rightBoundary) + " ");
                            } else {
                                sb.append("\\right. ");
                            }
                        }
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomTable) {
                        MTMathTable mTMathTable = (MTMathTable) mTMathAtom;
                        if (mTMathTable.getEnvironment() != null) {
                            sb.append("\\begin{");
                            sb.append(mTMathTable.getEnvironment());
                            sb.append("}");
                        }
                        int iNumRows = mTMathTable.numRows();
                        int i3 = 0;
                        while (i3 < iNumRows) {
                            List<MTMathList> list = mTMathTable.getCells().get(i3);
                            int size = list.size();
                            int i4 = 0;
                            while (i4 < size) {
                                MTMathList mTMathList = list.get(i4);
                                if (x44.r(mTMathTable.getEnvironment(), "matrix") && mTMathList.getAtoms().size() >= i && mTMathList.getAtoms().get(0).getType() == MTMathAtomType.KMTMathAtomStyle) {
                                    mTMathList = new MTMathList(mTMathList.getAtoms().subList(i, mTMathList.getAtoms().size()));
                                }
                                if ((x44.r(mTMathTable.getEnvironment(), "eqalign") || x44.r(mTMathTable.getEnvironment(), "aligned") || x44.r(mTMathTable.getEnvironment(), "split") || x44.r(mTMathTable.getEnvironment(), "align")) && i4 % 2 == i && mTMathList.getAtoms().size() >= i) {
                                    if (mTMathList.getAtoms().get(0).getType() == MTMathAtomType.KMTMathAtomOrdinary && mTMathList.getAtoms().get(0).getNucleus().length() == 0) {
                                        mTMathList = new MTMathList(mTMathList.getAtoms().subList(1, mTMathList.getAtoms().size()));
                                    }
                                }
                                sb.append(toLatexString(mTMathList));
                                if (i4 < list.size() - 1) {
                                    sb.append("&");
                                }
                                i4++;
                                i = 1;
                            }
                            if (i3 < mTMathTable.numRows() - i) {
                                sb.append("\\\\ ");
                            }
                            i3++;
                            i = 1;
                        }
                        if (mTMathTable.getEnvironment() != null) {
                            sb.append("\\end{");
                            sb.append(mTMathTable.getEnvironment());
                            sb.append("}");
                        }
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomOverline) {
                        if (mTMathAtom instanceof MTOverLine) {
                            sb.append("\\overline");
                        }
                        sb.append(mTMathAtom.toLatexString());
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomColorbox) {
                        sb.append(((MTMathColorbox) mTMathAtom).toLatexString());
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomUnderline) {
                        sb.append("\\underline");
                        sb.append(((MTUnderLine) mTMathAtom).toLatexString());
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomCancel) {
                        sb.append(((MTCancel) mTMathAtom).toLatexString());
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomBoxed) {
                        sb.append(((MTBoxed) mTMathAtom).toLatexString());
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomPhantom) {
                        sb.append(((MTPhantom) mTMathAtom).toLatexString());
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomUnderOverBrace) {
                        sb.append(((MTUnderOverBrace) mTMathAtom).toLatexString());
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomAccent) {
                        MTAccent mTAccent = (MTAccent) mTMathAtom;
                        sb.append("\\" + MTMathAtom.INSTANCE.accentName(mTAccent));
                        sb.append(mTAccent.toLatexString());
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomLargeOperator) {
                        MTLargeOperator mTLargeOperator = (MTLargeOperator) mTMathAtom;
                        MTMathAtom.Companion companion = MTMathAtom.INSTANCE;
                        String strLatexSymbolNameForAtom = companion.latexSymbolNameForAtom(mTMathAtom);
                        if (strLatexSymbolNameForAtom != null) {
                            MTMathAtom mTMathAtomAtomForLatexSymbolName = companion.atomForLatexSymbolName(strLatexSymbolNameForAtom);
                            mTMathAtomAtomForLatexSymbolName.getClass();
                            sb.append("\\" + strLatexSymbolNameForAtom + " ");
                            if (((MTLargeOperator) mTMathAtomAtomForLatexSymbolName).getHasLimits() != mTLargeOperator.getHasLimits()) {
                                if (mTLargeOperator.getHasLimits()) {
                                    sb.append("\\limits ");
                                } else {
                                    sb.append("\\nolimits ");
                                }
                            }
                        }
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomSpace) {
                        MTMathSpace mTMathSpace = (MTMathSpace) mTMathAtom;
                        String str3 = (String) MTMathListBuilder.spaceToCommands.get(Float.valueOf(mTMathSpace.getSpace()));
                        if (str3 != null) {
                            sb.append("\\" + str3 + " ");
                        } else {
                            sb.append(String.format("\\mkern%.1fmu", Arrays.copyOf(new Object[]{Float.valueOf(mTMathSpace.getSpace())}, 1)));
                        }
                    } else if (mTMathAtom.getType() == MTMathAtomType.KMTMathAtomStyle) {
                        sb.append("\\" + ((String) MTMathListBuilder.styleToCommands.get(((MTMathStyle) mTMathAtom).getStyle())) + " ");
                    } else if (mTMathAtom.getNucleus().length() == 0) {
                        sb.append("{}");
                    } else if (x44.r(mTMathAtom.getNucleus(), "∶")) {
                        sb.append(":");
                    } else if (x44.r(mTMathAtom.getNucleus(), "−")) {
                        sb.append("-");
                    } else {
                        String strLatexSymbolNameForAtom2 = MTMathAtom.INSTANCE.latexSymbolNameForAtom(mTMathAtom);
                        if (strLatexSymbolNameForAtom2 != null) {
                            sb.append("\\" + strLatexSymbolNameForAtom2 + " ");
                        } else {
                            sb.append(mTMathAtom.getNucleus());
                        }
                    }
                }
                MTMathList superScript = mTMathAtom.getSuperScript();
                if (superScript != null) {
                    sb.append("^{" + toLatexString(superScript) + "}");
                }
                MTMathList subScript = mTMathAtom.getSubScript();
                if (subScript != null) {
                    sb.append("_{" + toLatexString(subScript) + "}");
                }
            }
            if (fontStyle != MTFontStyle.KMTFontStyleDefault) {
                sb.append("}");
            }
            return sb.toString();
        }

        private Companion() {
        }

        public final MTMathList buildFromString(String str) {
            str.getClass();
            return new MTMathListBuilder(str).build();
        }
    }

    private final MTMathList buildInternal(boolean oneCharOnly) {
        return buildInternal(oneCharOnly, (char) 0);
    }
}
