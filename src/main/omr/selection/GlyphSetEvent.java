//----------------------------------------------------------------------------//
//                                                                            //
//                         G l y p h S e t E v e n t                          //
//                                                                            //
//  Copyright (C) Herve Bitteur 2000-2007. All rights reserved.               //
//  This software is released under the GNU General Public License.           //
//  Contact author at herve.bitteur@laposte.net to report bugs & suggestions. //
//----------------------------------------------------------------------------//
//
package omr.selection;

import omr.glyph.Glyph;

import java.util.List;

/**
 * Class <code>GlyphSetEvent</code> represents a Glyph Set selection
 *
 *
 * <dl>
 * <dt><b>Publishers:</b><dd>GlyphLag, GlyphLagView
 * <dt><b>Subscribers:</b><dd>GlyphBoard, GlyphLagView, ScoreMenu, 
 * SymbolGlyphBoard, SymbolsEditor
 * <dt><b>Readers:</b><dd>GlyphBoard, GlyphLag, GlyphLagView, GlyphMenu, 
 * SymbolsEditor
 * </dl>
 * @author Herv&eacute Bitteur
 * @version $Id$
 */
public class GlyphSetEvent
    extends GlyphLagEvent
{
    //~ Instance fields --------------------------------------------------------

    /** The selected glyph set, which may be null */
    public final List<Glyph> glyphs;

    //~ Constructors -----------------------------------------------------------

    //------------//
    // GlyphEvent //
    //------------//
    /**
     * Creates a new GlyphEvent object.
     *
     * @param source the entity that created this event
     * @param hint hint about event origin (or null)
     * @param glyphs the selected collection of glyphs (or null)
     */
    public GlyphSetEvent (Object        source,
                          SelectionHint hint,
                          MouseMovement movement,
                          List<Glyph>   glyphs)
    {
        super(source, hint, movement);
        this.glyphs = glyphs;
    }

    //~ Methods ----------------------------------------------------------------

    //-----------//
    // getEntity //
    //-----------//
    @Override
    public List<Glyph> getData ()
    {
        return glyphs;
    }

    //----------------//
    // internalString //
    //----------------//
    @Override
    protected String internalString ()
    {
        return " " + Glyph.toString(glyphs);
    }
}