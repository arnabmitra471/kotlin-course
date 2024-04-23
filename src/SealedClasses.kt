fun main(){
    val tile : Tile = GreenTile("Mushroom",25)

    val points = when(tile)
    {
        is RedTile -> tile.points * 2
        is BlueTile -> tile.points * 5
        is GreenTile -> tile.points * 10
    }
    println(points)
}
sealed class Tile

class RedTile(val type: String, val points: Int) : Tile()
class BlueTile(val type: String, val points: Int) : Tile()
class GreenTile(val type: String, val points : Int): Tile()